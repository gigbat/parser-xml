package com.onenetwork.parser;

import lombok.experimental.UtilityClass;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.util.HashSet;
import java.util.Set;

@UtilityClass
public class ReferenceDataTextExtractor {

    private static final String PACKAGE_NAME = "com.onenetwork.model.ae_ax.e0.reference";

    public Class<?> getReferenceClass(final String refType) {
        Set<Class<?>> classesInPackage = getClassesInPackage();
        return getClassByRefType(classesInPackage, refType);
    }

    private Set<Class<?>> getClassesInPackage() {
        Reflections reflections = new Reflections(PACKAGE_NAME, new SubTypesScanner(false));
        return new HashSet<>(reflections.getSubTypesOf(Object.class));
    }

    private Class<?> getClassByRefType(final Set<Class<?>> classesInPackage,
                                       final String refType) {
        return classesInPackage.stream().filter(e -> e.getSimpleName().toUpperCase().equals(refType)).findFirst()
                .orElseThrow(() -> new RuntimeException("Class " + refType
                        + " not found in package " + PACKAGE_NAME));
    }
}
