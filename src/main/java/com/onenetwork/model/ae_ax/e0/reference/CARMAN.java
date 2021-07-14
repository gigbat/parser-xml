package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CARMAN {
    @Position(startPosition = 26, endPosition = 33)
    private String manifestedQuantity;
    @Position(startPosition = 35, endPosition = 39)
    private String manifestedQuantityUnitOfMeasureCode;
}
