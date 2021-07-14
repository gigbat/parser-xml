package com.onenetwork.model.sx.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE11RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 5)
    private String entryDateElectionCode;
    @Position(startPosition = 6, endPosition = 11)
    private String electedEntryDate;
    @Position(startPosition = 12, endPosition = 15)
    private String locationOfGoods;
    @Position(startPosition = 16, endPosition = 19)
    private String electedExamSite;
    @Position(startPosition = 20, endPosition = 39)
    private String conveyanceName;
    @Position(startPosition = 40, endPosition = 44)
    private String voyageOrFlightOrTripManifestNumber;
    @Position(startPosition = 45, endPosition = 64)
    private String generalOrderNumber;
    @Position(startPosition = 65, endPosition = 68)
    private String cbpBondedWarehouse;
    @Position(startPosition = 69, endPosition = 71)
    private String originatingWarehouseEntryFilerCode;
    @Position(startPosition = 72, endPosition = 79)
    private String originatingWarehouseEntryNumber;
    @Position(startPosition = 80, endPosition = 80)
    private String immediateDeliveryIndicator;
}
