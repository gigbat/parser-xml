package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FiftyThreeRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 12)
    private String caseNumber;
    @Position(startPosition = 13, endPosition = 13)
    private String bondOrCashClaimCode;
    @Position(startPosition = 14, endPosition = 21)
    private String caseDepositRate;
    @Position(startPosition = 22, endPosition = 22)
    private String caseRateTypeQualifierCode;
    @Position(startPosition = 25, endPosition = 34)
    private String adOrCvdValueOfGoodsAmount;
    @Position(startPosition = 35, endPosition = 46)
    private String adOrCvdQuantity;
    @Position(startPosition = 47, endPosition = 56)
    private String adOrCvdDutyAmount;
    @Position(startPosition = 57, endPosition = 66)
    private String adOrCvdNonReimbursementDeclarationIdentifier;
}
