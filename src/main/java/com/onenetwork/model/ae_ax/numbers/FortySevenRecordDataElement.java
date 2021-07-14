package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FortySevenRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 3)
    private String articlePartyTypeCode;
    @Position(startPosition = 4, endPosition = 18)
    private String articlePartyIdentifier;
}
