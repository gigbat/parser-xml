package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PSCHRE {
    @Position(startPosition = 26, endPosition = 28)
    private String postSummaryCorrectionHeaderReasonCode;
}
