package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TwentyTwoRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 10)
    private String manifestedQuantity;
    @Position(startPosition = 11, endPosition = 15)
    private String manifestedQuantityUnitOfMeasureCode;
}
