package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FortyOneRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 3)
    private String ftzMerchandiseStatusCode;
    @Position(startPosition = 4, endPosition = 9)
    private String privilegedFtzMerchandiseFilingDate;
    @Position(startPosition = 10, endPosition = 19)
    private String ftzLineItemQuantity;
}
