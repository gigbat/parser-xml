package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ThirtyFourRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 5)
    private String accountingClassCodeFirst;
    @Position(startPosition = 6, endPosition = 13)
    private String headerFeeAmountFirst;
    @Position(startPosition = 14, endPosition = 16)
    private String accountingClassCodeSecond;
    @Position(startPosition = 17, endPosition = 24)
    private String headerFeeAmountSecond;
}
