package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LINFEE {
    @Position(startPosition = 26, endPosition = 28)
    private String accountingClassCode;
    @Position(startPosition = 30, endPosition = 37)
    private String userFeeAmount;
}
