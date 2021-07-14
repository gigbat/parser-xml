package com.onenetwork.model.sx.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE41RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 5)
    private String zoneStatus;
    @Position(startPosition = 6, endPosition = 11)
    private String privilegedFtzMerchandiseFilingDate;
    @Position(startPosition = 12, endPosition = 19)
    private String ftzLineItemQuantity;
}
