package com.onenetwork.model.so;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SO10RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 8)
    private String districtOrPortOfEntry;
    @Position(startPosition = 9, endPosition = 11)
    private String entryFilerCode;
    @Position(startPosition = 14, endPosition = 21)
    private String entryNumber;
    @Position(startPosition = 23, endPosition = 24)
    private String entryTypeCode;
    @Position(startPosition = 25, endPosition = 36)
    private String importerOfRecordNumber;
    @Position(startPosition = 37, endPosition = 40)
    private String carrierCode;
    @Position(startPosition = 41, endPosition = 60)
    private String vesselName;
    @Position(startPosition = 61, endPosition = 65)
    private String voyageOrFlightOrTripManifestNumber;
    @Position(startPosition = 66, endPosition = 71)
    private String estimatedDateOfArrival;
    @Position(startPosition = 72, endPosition = 72)
    private String splitShipmentReleaseCode;
    @Position(startPosition = 73, endPosition = 73)
    private String correctionResponseIndicator;
}
