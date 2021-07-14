package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CONREL {
    @Position(startPosition = 26, endPosition = 28)
    private String releaseEntryFilerCode;
    @Position(startPosition = 31, endPosition = 38)
    private String releaseEntryNumber;
}
