package com.onenetwork.model.sn_us_isf10;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SF20RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 7)
    private String referenceIdentifierQualifier;
    @Position(startPosition = 8, endPosition = 57)
    private String referenceIdentifier;
}
