package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EightyNineRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 5)
    private String accountingClassCodeFirst;
    @Position(startPosition = 6, endPosition = 16)
    private String totalFeeAmountFirst;
    @Position(startPosition = 17, endPosition = 19)
    private String accountingClassCodeSecond;
    @Position(startPosition = 20, endPosition = 30)
    private String totalFeeAmountSecond;
    @Position(startPosition = 31, endPosition = 33)
    private String accountingClassCodeThird;
    @Position(startPosition = 34, endPosition = 44)
    private String totalFeeAmountThird;
    @Position(startPosition = 45, endPosition = 47)
    private String accountingClassCodeFourth;
    @Position(startPosition = 48, endPosition = 58)
    private String totalFeeAmountFourth;
    @Position(startPosition = 59, endPosition = 61)
    private String accountingClassCodeFifth;
    @Position(startPosition = 62, endPosition = 72)
    private String totalFeeAmountFifth;
}
