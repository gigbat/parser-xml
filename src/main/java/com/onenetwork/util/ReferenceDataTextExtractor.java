package com.onenetwork.util;

import lombok.experimental.UtilityClass;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.util.HashSet;
import java.util.Set;

@UtilityClass
public class ReferenceDataTextExtractor {

    public Class<?> getReferenceClass(final String refType, final String pathToPackage) {
        Set<Class<?>> classesInPackage = getClassesInPackage(pathToPackage);
        return getClassByRefType(classesInPackage, refType);
    }

    private Set<Class<?>> getClassesInPackage(final String pathToPackage) {
        Reflections reflections = new Reflections(pathToPackage, new SubTypesScanner(false));
        return new HashSet<>(reflections.getSubTypesOf(Object.class));
    }

    private Class<?> getClassByRefType(final Set<Class<?>> classesInPackage,
                                       final String refType) {
        return classesInPackage.stream().filter(e -> e.getSimpleName().toUpperCase().equals(refType)).findFirst()
                .orElseThrow(() -> new RuntimeException("Class " + refType + " not found"));
    }
}
