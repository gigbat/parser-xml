package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TwentyThreeRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 3)
    private String manifestComponentTypeCode;
    @Position(startPosition = 4, endPosition = 7)
    private String manifestComponentIssuerCode;
    @Position(startPosition = 8, endPosition = 19)
    private String manifestComponentIdentifier;
}
