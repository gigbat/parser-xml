package com.onenetwork.interpreter;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onenetwork.comparator.TreeComparator;
import com.onenetwork.parser.LineParser;
import com.onenetwork.response.ResponseMessage;
import com.onenetwork.storage.MessageStorage;
import com.onenetwork.util.XmlExtractor;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonTest {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @BeforeAll
    public static void configure() {
        MAPPER.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

    @Test
    public void starter() {
        int counter = 1;

        List<MessageStorage> storages = XmlExtractor.extract();
        List<File> files = new ArrayList<>();

        for (MessageStorage storage : storages) {
            files = updateFileList(files, counter, storage);
            compare(storage, files, counter);
            counter = getActualCounter(files, counter);
        }
    }

    private List<File> updateFileList(final List<File> files, final int counter, final MessageStorage storage) {
        if (files.isEmpty() || files.size() >= counter) {
            String endPoint = storage.getPath().substring(0, storage.getPath().lastIndexOf(File.separator));
            return validateFiles(endPoint);
        }
        return files;
    }

    private List<File> validateFiles(final String endPoint) {
        return Arrays.stream(Objects.requireNonNull(new File(endPoint).listFiles()))
                .filter(e -> e.isFile() && e.getAbsolutePath().endsWith(".json"))
                .collect(Collectors.toList());
    }

    @SneakyThrows
    private void compare(final MessageStorage storage, final List<File> files, final int counter) {
        ResponseMessage responseMessage = storage.getResponseMessage();
        LineParser lineParser = new LineParser();

        if (responseMessage != null) {
            List<Object> models = lineParser.getModels(responseMessage);
            String actual = MAPPER.writeValueAsString(models);
            String expected = FileUtils.readFileToString(files.get(counter - 1), StandardCharsets.UTF_8);
            if (responseMessage.getResponse().getMessageType().equals("ISF-VALIDATE")) {
                TreeComparator.compare(expected, actual);
            }
        }
    }

    private int getActualCounter(final List<File> files, final int counter) {
        return files.size() <= counter ? 1 : counter + 1;
    }
}
