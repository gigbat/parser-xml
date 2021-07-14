package com.onenetwork.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class ControlIdentifierSelector {
    private final String messageType;
    private final String controlIdentifier;
}
