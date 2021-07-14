package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class COMDES {
    @Position(startPosition = 26, endPosition = 80)
    private String commercialDescriptionText;
}
