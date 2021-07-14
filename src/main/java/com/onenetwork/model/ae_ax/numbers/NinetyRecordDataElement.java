package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NinetyRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 13)
    private String grandTotalDutyAmount;
    @Position(startPosition = 15, endPosition = 25)
    private String grandTotalUserFeeAmount;
    @Position(startPosition = 27, endPosition = 37)
    private String grandTotalIrTaxAmount;
    @Position(startPosition = 39, endPosition = 49)
    private String grandTotalAdDutyAmount;
    @Position(startPosition = 51, endPosition = 61)
    private String grandTotalCvDutyAmount;
    @Position(startPosition = 63, endPosition = 73)
    private String grandTotalOtherRevenueAmount;
}
