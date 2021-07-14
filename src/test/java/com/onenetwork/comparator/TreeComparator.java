package com.onenetwork.comparator;

import org.imagination.comparator.Comparator;
import lombok.experimental.UtilityClass;

import java.util.Collections;

@UtilityClass
public class TreeComparator {

    private static final Comparator COMPARATOR = Comparator.java().strict(Collections.emptyMap());

    public void compare(final String expected, final String actual) {
        try {
            COMPARATOR.compare(expected, actual);
        } catch (Throwable t) {
            throw new RuntimeException("Can't compare expected and actual results");
        }
    }

}