package com.onenetwork.parser;

import com.onenetwork.constant.PackagePathConstant;
import lombok.AllArgsConstructor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.util.Arrays;
import java.util.stream.Collectors;

import static com.onenetwork.constant.DelimiterConstant.DELIMITER_DOUBLE_DOT;

public class XmlParser {
    public <E> MappingResult<E> apply(final Class<?> clazz, final String xml) {
        try {
            E o = deserializeToConfig(clazz, xml);
            return new MappingResult<>(o, null);
        } catch (Exception exception) {
            return new MappingResult<>(null, exception);
        }
    }

    private <E> E deserializeToConfig(final Class<?> clazz, final String xml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(collectObjectFactories());
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StreamSource streamSource = new StreamSource(new StringReader(xml));
        JAXBElement<?> element = unmarshaller.unmarshal(streamSource, clazz);
        return (E) element.getValue();
    }

    private String collectObjectFactories() {
        return Arrays.stream(PackagePathConstant.values())
                .map(PackagePathConstant::getPath)
                .collect(Collectors.joining(DELIMITER_DOUBLE_DOT));
    }

    @AllArgsConstructor
    public static class MappingResult<E> {
        public final E content;
        public final Exception exception;
    }
}
