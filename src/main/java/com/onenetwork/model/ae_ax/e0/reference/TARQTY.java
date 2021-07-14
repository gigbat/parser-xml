package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TARQTY {
    @Position(startPosition = 26, endPosition = 37)
    private String quantity;
    @Position(startPosition = 39, endPosition = 41)
    private String unitOfMeasureCode;
}
