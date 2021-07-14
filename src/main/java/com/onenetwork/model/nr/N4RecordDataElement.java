package com.onenetwork.model.nr;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class N4RecordDataElement {
    @Position(startPosition = 1, endPosition = 1)
    private String controlIdentifier;
    @Position(startPosition = 2, endPosition = 2)
    private String recordType;
    @Position(startPosition = 3, endPosition = 6)
    private String districtOrPortOfEntrySummary;
    @Position(startPosition = 7, endPosition = 9)
    private String brokerNumberOrEntryFilerCode;
    @Position(startPosition = 10, endPosition = 18)
    private String entryNumber;
    @Position(startPosition = 19, endPosition = 29)
    private String totalPaidCountervailingDuty;
    @Position(startPosition = 30, endPosition = 40)
    private String totalPaidFees;
    @Position(startPosition = 41, endPosition = 51)
    private String liquidatedAntidumpingDuty;
    @Position(startPosition = 52, endPosition = 62)
    private String liquidatedCountervailingDuty;
    @Position(startPosition = 63, endPosition = 73)
    private String liquidatedFees;
    @Position(startPosition = 74, endPosition = 75)
    private String changeLiquidationReasonCodeFirst;
    @Position(startPosition = 76, endPosition = 77)
    private String changeLiquidationReasonCodeSecond;
    @Position(startPosition = 78, endPosition = 79)
    private String changeLiquidationReasonCodeThird;
}
