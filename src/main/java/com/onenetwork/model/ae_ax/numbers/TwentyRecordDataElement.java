package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TwentyRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 6)
    private String carrierCode;
    @Position(startPosition = 7, endPosition = 10)
    private String districtOrPortOfUnlading;
    @Position(startPosition = 11, endPosition = 16)
    private String estimatedDateOfArrival;
    @Position(startPosition = 17, endPosition = 20)
    private String locationOfGoodsCode;
    @Position(startPosition = 21, endPosition = 40)
    private String conveyanceName;
    @Position(startPosition = 41, endPosition = 47)
    private String vesselCode;
    @Position(startPosition = 48, endPosition = 51)
    private String designatedExamPortCode;
    @Position(startPosition = 52, endPosition = 57)
    private String inBondOrInTransitDate;
}
