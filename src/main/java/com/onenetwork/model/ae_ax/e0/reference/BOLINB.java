package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BOLINB {
    @Position(startPosition = 26, endPosition = 26)
    private String manifestComponentTypeCode;
    @Position(startPosition = 28, endPosition = 39)
    private String manifestComponentIdentifier;
}
