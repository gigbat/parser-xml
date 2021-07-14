package com.onenetwork.model.sx.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE10RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 5)
    private String updateActionCode;
    @Position(startPosition = 6, endPosition = 8)
    private String entryFilerCode;
    @Position(startPosition = 11, endPosition = 18)
    private String entryNumber;
    @Position(startPosition = 20, endPosition = 21)
    private String entryType;
    @Position(startPosition = 22, endPosition = 24)
    private String importerOfRecordType;
    @Position(startPosition = 25, endPosition = 36)
    private String importerOfRecord;
    @Position(startPosition = 37, endPosition = 38)
    private String modeOfTransportationCode;
    @Position(startPosition = 39, endPosition = 39)
    private String bondTypeCode;
    @Position(startPosition = 40, endPosition = 49)
    private String estimatedEntryValue;
    @Position(startPosition = 50, endPosition = 54)
    private String plannedPortOfEntry;
    @Position(startPosition = 55, endPosition = 55)
    private String splitShipmentReleaseCode;
    @Position(startPosition = 56, endPosition = 60)
    private String portOfUnlading;
}
