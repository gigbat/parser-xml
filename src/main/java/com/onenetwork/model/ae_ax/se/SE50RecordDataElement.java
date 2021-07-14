package com.onenetwork.model.ae_ax.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE50RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 7)
    private String entityCode;
    @Position(startPosition = 8, endPosition = 42)
    private String entityName;
    @Position(startPosition = 43, endPosition = 45)
    private String entityIdentifierQualifier;
    @Position(startPosition = 46, endPosition = 65)
    private String entityIdentifier;
}
