package com.onenetwork.model.sn_us_isf10;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SF13RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 6)
    private String shipmentSubType;
    @Position(startPosition = 7, endPosition = 17)
    private String estimatedValue;
    @Position(startPosition = 18, endPosition = 28)
    private String estimatedQuantity;
    @Position(startPosition = 29, endPosition = 31)
    private String unitOfMeasure;
    @Position(startPosition = 32, endPosition = 42)
    private String estimatedWeight;
    @Position(startPosition = 43, endPosition = 43)
    private String weightQualifiers;
}
