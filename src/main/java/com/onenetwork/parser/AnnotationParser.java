package com.onenetwork.parser;

import com.onenetwork.model.CustomObject;
import com.onenetwork.model.Position;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.lang.reflect.Field;

@UtilityClass
public class AnnotationParser {
    @SneakyThrows
    public Object getParsedValue(final Class<?> clazz, final String line) {
        Field[] declaredFields = clazz.getDeclaredFields();
        Object object = clazz.newInstance();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            generateFieldValue(line, declaredField, object);
        }
        return object;
    }

    private void generateFieldValue(final String line, final Field field, final Object object) {
        Position position = field.getAnnotation(Position.class);
        CustomObject customObject = field.getAnnotation(CustomObject.class);

        if (isSimpleType(position, customObject)) {
            setToSimpleType(position, line, field, object);
        } else {
            setToObjectType(customObject, line);
        }
    }

    private boolean isSimpleType(final Position position, final CustomObject customObject) {
        return position != null && customObject == null;
    }

    @SneakyThrows
    private void setToSimpleType(final Position position,
                                 final String line,
                                 final Field field,
                                 final Object object) {
        int startPosition = position.startPosition() - 1;
        int endPosition = position.endPosition();
        String substring = line.substring(startPosition, endPosition);
        field.set(object, substring);
    }

    @SneakyThrows
    private void setToObjectType(final CustomObject customObject,
                                 final String line) {
        int startPosition = customObject.startPosition();
        int endPosition = customObject.endPosition();
        String substring = line.substring(startPosition, endPosition);
        String pathToPackage = customObject.pathToPackage();
        Class<?> clazz = ReferenceDataTextExtractor.getReferenceClass(substring, pathToPackage);
        getParsedValue(clazz, line);
    }
}
