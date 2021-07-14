package com.onenetwork.model.so;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SO42RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 16)
    private String inBondNumber;
    @Position(startPosition = 17, endPosition = 18)
    private String inBondEntryType;
    @Position(startPosition = 19, endPosition = 22)
    private String portOfInBondDeparture;
    @Position(startPosition = 23, endPosition = 26)
    private String portOfInBondArrival;
    @Position(startPosition = 27, endPosition = 32)
    private String inBondCreateDate;
    @Position(startPosition = 33, endPosition = 38)
    private String dateOfInBondArrival;
    @Position(startPosition = 39, endPosition = 46)
    private String inBondQuantity;
}
