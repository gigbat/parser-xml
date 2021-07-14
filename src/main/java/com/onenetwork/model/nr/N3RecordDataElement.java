package com.onenetwork.model.nr;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class N3RecordDataElement {
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
    @Position(startPosition = 19, endPosition = 20)
    private String entryTypeCode;
    @Position(startPosition = 21, endPosition = 32)
    private String importerOfRecordNumber;
    @Position(startPosition = 33, endPosition = 38)
    private String entryDate;
    @Position(startPosition = 39, endPosition = 40)
    private String extensionOrSuspensionCodeFirst;
    @Position(startPosition = 41, endPosition = 41)
    private String numberOfTimesExtended;
    @Position(startPosition = 42, endPosition = 47)
    private String extensionOrSuspensionNoticeDate;
    @Position(startPosition = 48, endPosition = 56)
    private String brokerReferenceNumber;
    @Position(startPosition = 57, endPosition = 58)
    private String extensionOrSuspensionCodeSecond;
    @Position(startPosition = 59, endPosition = 60)
    private String extensionOrSuspensionCodeThird;
    @Position(startPosition = 61, endPosition = 62)
    private String extensionOrSuspensionCodeFourth;
}
