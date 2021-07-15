package com.onenetwork.model.nr;

import com.onenetwork.model.Position;

public class N2RecordDataElement {
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
    @Position(startPosition = 19, endPosition = 24)
    private String liquidationDate;
    @Position(startPosition = 25, endPosition = 26)
    private String liquidationReasonCode;
    @Position(startPosition = 27, endPosition = 35)
    private String brokerReferenceNumber;
    @Position(startPosition = 54, endPosition = 54)
    private String liquidationType;
    @Position(startPosition = 55, endPosition = 60)
    private String entryDate;
    @Position(startPosition = 61, endPosition = 71)
    private String totalPaidAntidumpingDuty;
    @Position(startPosition = 72, endPosition = 80)
    private String interestAmount;
}
