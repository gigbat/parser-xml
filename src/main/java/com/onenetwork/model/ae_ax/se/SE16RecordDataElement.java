package com.onenetwork.model.ae_ax.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE16RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 8)
    private String carrierCode;
    @Position(startPosition = 9, endPosition = 13)
    private String voyageOrFlightOrTripManifestNumber;
    @Position(startPosition = 14, endPosition = 19)
    private String dateOfArrival;
    @Position(startPosition = 20, endPosition = 27)
    private String quantity;
    @Position(startPosition = 28, endPosition = 32)
    private String unitOfMeasure;
    @Position(startPosition = 33, endPosition = 52)
    private String conveyanceName;
}
