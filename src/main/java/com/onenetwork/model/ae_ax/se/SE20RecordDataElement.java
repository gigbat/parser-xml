package com.onenetwork.model.ae_ax.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE20RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 7)
    private String referenceIdentifierQualifier;
    @Position(startPosition = 8, endPosition = 57)
    private String referenceIdentifier;
}
