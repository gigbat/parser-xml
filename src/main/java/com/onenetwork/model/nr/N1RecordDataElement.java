package com.onenetwork.model.nr;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class N1RecordDataElement {
    @Position(startPosition = 1, endPosition = 1)
    private String controlIdentifier;
    @Position(startPosition = 2, endPosition = 2)
    private String recordType;
    @Position(startPosition = 3, endPosition = 6)
    private String districtOrPortOfEntryOrSummary;
    @Position(startPosition = 7, endPosition = 9)
    private String brokerNumberOrEntryFilerCode;
    @Position(startPosition = 10, endPosition = 18)
    private String entryNumber;
    @Position(startPosition = 19, endPosition = 20)
    private String entryType;
    @Position(startPosition = 21, endPosition = 32)
    private String importerOfRecordNumber;
    @Position(startPosition = 33, endPosition = 43)
    private String totalPaidDuty;
    @Position(startPosition = 44, endPosition = 54)
    private String totalPaidTax;
    @Position(startPosition = 55, endPosition = 65)
    private String liquidatedDuty;
    @Position(startPosition = 66, endPosition = 76)
    private String liquidatedTax;
    @Position(startPosition = 77, endPosition = 77)
    private String negativeInterestAmountIndicator;
}
