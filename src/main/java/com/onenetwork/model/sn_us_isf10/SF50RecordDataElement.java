package com.onenetwork.model.sn_us_isf10;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SF50RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 7)
    private String codeQualifierFirst;
    @Position(startPosition = 8, endPosition = 22)
    private String foreignPortOfUnlading;
    @Position(startPosition = 23, endPosition = 25)
    private String codeQualifierSecond;
    @Position(startPosition = 26, endPosition = 40)
    private String placeOfDelivery;
}
