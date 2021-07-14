package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FortyTwoRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 17)
    private String supplierIdCode;
    @Position(startPosition = 18, endPosition = 34)
    private String invoiceNumber;
    @Position(startPosition = 36, endPosition = 39)
    private String invoiceLineRangeFirstBegin;
    @Position(startPosition = 41, endPosition = 44)
    private String invoiceLineRangeFirstEnd;
    @Position(startPosition = 46, endPosition = 49)
    private String invoiceLineRangeSecondBegin;
    @Position(startPosition = 51, endPosition = 54)
    private String invoiceLineRangeSecondEnd;
    @Position(startPosition = 56, endPosition = 59)
    private String invoiceLineRangeThirdBegin;
    @Position(startPosition = 61, endPosition = 64)
    private String invoiceLineRangeThirdEnd;
    @Position(startPosition = 66, endPosition = 69)
    private String invoiceLineRangeFourthBegin;
    @Position(startPosition = 71, endPosition = 74)
    private String invoiceLineRangeFourthEnd;
}
