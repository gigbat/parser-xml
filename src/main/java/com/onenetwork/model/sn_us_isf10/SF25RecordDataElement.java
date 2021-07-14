package com.onenetwork.model.sn_us_isf10;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SF25RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 6)
    private String equipmentDescriptionCode;
    @Position(startPosition = 7, endPosition = 10)
    private String equipmentInitial;
    @Position(startPosition = 11, endPosition = 25)
    private String equipmentNumber;
    @Position(startPosition = 26, endPosition = 26)
    private String equipmentNumberCheckDigit;
    @Position(startPosition = 27, endPosition = 30)
    private String equipmentSizeTypeCode;
}
