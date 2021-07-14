package com.onenetwork.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SimpleControlIdentifier {
    DOT(".", "General Message"),
    DEBUG("D", "Debug Message - generally you won't receive these"),
    ERROR("E", "Error Message"),
    INFORMATIONAL("I", "Informational Message"),
    TRACE("T", "Trace Message - generally you won't receive these"),
    WARN("W", "Warning Message");

    private final String symbol;
    private final String description;
}
