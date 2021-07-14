package com.onenetwork.util;

import com.onenetwork.parser.XmlParser;
import com.onenetwork.parser.XmlParser.MappingResult;
import com.onenetwork.response.ResponseMessage;
import com.onenetwork.storage.MessageStorage;
import com.onenetwork.storage.RootContentStorage;
import com.onenetwork.webservice.TMicInterface;
import com.onenetwork.webservice.TMicInterfaceMessage;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static com.onenetwork.constant.DelimiterConstant.DELIMITER_EMPTY;

@UtilityClass
public class XmlExtractor {

    private final String SUFFIX_XML = ".xml";
    private final String PATH_TO_TEST_FOLDER = "test";

    public List<MessageStorage> extract() {
        List<RootContentStorage> rootContents = getRootContents();
        return rootContents == null ? Collections.emptyList() : getContents(rootContents);
    }

    @SneakyThrows
    private List<RootContentStorage> getRootContents() {
        URL resource = Thread.currentThread().getContextClassLoader().getResource(PATH_TO_TEST_FOLDER);
        if (resource != null) {
            File rootFile = new File(resource.toURI());
            List<RootContentStorage> rootContents = new ArrayList<>();

            File[] listFiles = rootFile.listFiles();
            if (listFiles != null) {
                walk(listFiles, rootContents);
                return rootContents;
            }
        }
        return null;
    }

    @SneakyThrows
    private void walk(final File[] listFiles, final List<RootContentStorage> rootContents) {

        for (File file : listFiles) {
            if (file.isFile() && matchingXmlFile(file)) {
                String path = file.getAbsolutePath();
                String xml = String.join(DELIMITER_EMPTY,
                        Files.readAllLines(Paths.get(path), StandardCharsets.US_ASCII));
                rootContents.add(new RootContentStorage(path, xml));
            } else if (file.isDirectory()) {
                File[] directoryListFiles = file.listFiles();
                if (directoryListFiles != null) {
                    walk(directoryListFiles, rootContents);
                }
            }
        }
    }

    private boolean matchingXmlFile(final File file) {
        return file.getAbsolutePath().endsWith(SUFFIX_XML);
    }

    private List<MessageStorage> getContents(final List<RootContentStorage> rootContents) {
        XmlParser parser = new XmlParser();
        List<MessageStorage> responseMessageList = new ArrayList<>();
        Iterator<RootContentStorage> iterator = rootContents.iterator();

        while (iterator.hasNext()) {
            RootContentStorage rootContent = iterator.next();
            if (rootContent != null) {
                MappingResult<TMicInterface> rootMappingResult =
                        parser.apply(TMicInterface.class, rootContent.getXml());
                List<TMicInterfaceMessage> messageContent = getMessages(rootMappingResult.content);

                if (messageContent != null && !messageContent.isEmpty()) {
                    responseMessageList.addAll(getResponseMessage(parser, rootContent, messageContent));
                }
            }
        }
        return responseMessageList;
    }

    private List<MessageStorage> getResponseMessage(final XmlParser parser,
                                                    final RootContentStorage rootContent,
                                                    final List<TMicInterfaceMessage> messageContent) {
        List<MessageStorage> messageStorageList = new ArrayList<>();
        for (int i = 0; i < messageContent.size(); i++) {
            String value = messageContent.get(i).getBody().getValue();
            MappingResult<ResponseMessage> responseMessageMappingResult =
                    parser.apply(ResponseMessage.class, value);
            messageStorageList.add(new MessageStorage(rootContent.getPath(),
                    responseMessageMappingResult.content));
        }
        return messageStorageList;
    }

    private static List<TMicInterfaceMessage> getMessages(final TMicInterface micInterface) {
        return micInterface != null
                ? micInterface.getMessages().getMessage()
                : Collections.emptyList();
    }
}
