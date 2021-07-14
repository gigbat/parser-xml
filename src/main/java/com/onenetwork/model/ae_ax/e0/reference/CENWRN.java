package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CENWRN {
    @Position(startPosition = 26, endPosition = 28)
    private String censusWarningConditionCode;
    @Position(startPosition = 30, endPosition = 31)
    private String censusWarningConditionOverrideCode;
}
