package com.onenetwork.model.ae_ax.e0;

import com.onenetwork.model.CustomObject;
import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class E0RecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 4, endPosition = 9)
    private String referenceDataTypeCode;
    @Position(startPosition = 11, endPosition = 16)
    private String occurrencePosition;
    @Position(startPosition = 18, endPosition = 24)
    private String referenceIdConstant;
    @CustomObject(startPosition = 4, endPosition = 9, pathToPackage = "com.onenetwork.model.ae_ax.e0.reference")
    private Object referenceDataText;
}
