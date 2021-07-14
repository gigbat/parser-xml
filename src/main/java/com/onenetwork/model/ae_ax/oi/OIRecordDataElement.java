package com.onenetwork.model.ae_ax.oi;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OIRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 11, endPosition = 80)
    private String commercialDescriptionText;
}
