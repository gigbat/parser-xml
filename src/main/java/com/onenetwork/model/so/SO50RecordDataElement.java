package com.onenetwork.model.so;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SO50RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 10)
    private String dispositionDate;
    @Position(startPosition = 11, endPosition = 14)
    private String dispositionTime;
    @Position(startPosition = 15, endPosition = 16)
    private String dispositionCode;
    @Position(startPosition = 17, endPosition = 56)
    private String narrativeMessage;
    @Position(startPosition = 57, endPosition = 57)
    private String splitIndicator;
    @Position(startPosition = 58, endPosition = 61)
    private String carrierCode;
    @Position(startPosition = 62, endPosition = 66)
    private String voyageOrFlightOrTripManifestNumber;
    @Position(startPosition = 67, endPosition = 72)
    private String dateOfArrival;
    @Position(startPosition = 73, endPosition = 76)
    private String districtOrPortOfArrival;
}
