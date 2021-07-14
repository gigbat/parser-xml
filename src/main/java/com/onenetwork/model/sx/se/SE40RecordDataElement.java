package com.onenetwork.model.sx.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE40RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 7)
    private String lineItemIdentifier;
    @Position(startPosition = 8, endPosition = 9)
    private String countryOfOrigin;
    @Position(startPosition = 11, endPosition = 80)
    private String commercialInvoiceDescription;
}
