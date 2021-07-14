package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ThirtySixRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 77)
    private String pscFilingExplanationText;
}
