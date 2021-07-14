package com.onenetwork.model.so;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SO30RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 7)
    private String lineItemIdentifier;
    @Position(startPosition = 8, endPosition = 9)
    private String countryOfOrigin;
    @Position(startPosition = 10, endPosition = 19)
    private String htsNumber;
}
