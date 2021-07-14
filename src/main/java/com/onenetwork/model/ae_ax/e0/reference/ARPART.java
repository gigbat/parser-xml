package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ARPART {
    @Position(startPosition = 26, endPosition = 26)
    private String articlePartyIdentifierTypeCode;
    @Position(startPosition = 28, endPosition = 42)
    private String articlePartyIdentifier;
}
