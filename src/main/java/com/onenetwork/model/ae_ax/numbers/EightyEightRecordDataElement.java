package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EightyEightRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 13)
    private String totalBondedAdDutyAmount;
    @Position(startPosition = 15, endPosition = 25)
    private String totalCashDepositAdDutyAmount;
    @Position(startPosition = 27, endPosition = 37)
    private String totalBondedCvDutyAmount;
    @Position(startPosition = 39, endPosition = 49)
    private String totalCashDepositCvDutyAmount;
}
