package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ElevenRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 14)
    private String importerOfRecordNumber;
    @Position(startPosition = 15, endPosition = 26)
    private String consigneeNumber;
    @Position(startPosition = 27, endPosition = 38)
    private String designatedNotifyPartyNumber;
    @Position(startPosition = 42, endPosition = 47)
    private String estimatedEntryDate;
    @Position(startPosition = 48, endPosition = 53)
    private String dateOfImportation;
    @Position(startPosition = 54, endPosition = 60)
    private String foreignTradeZoneIdentifier;
    @Position(startPosition = 61, endPosition = 62)
    private String  stateOfDestinationCode;
}
