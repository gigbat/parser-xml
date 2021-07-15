package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FortyRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 7)
    private String lineItemIdentifier;
    @Position(startPosition = 8, endPosition = 8)
    private String articleSetIndicator;
    @Position(startPosition = 9, endPosition = 10)
    private String countryOfOriginCode;
    @Position(startPosition = 11, endPosition = 12)
    private String countryOfExportCode;
    @Position(startPosition = 13, endPosition = 18)
    private String dateOfExportation;
    @Position(startPosition = 19, endPosition = 24)
    private String dateOfExportationTextiles;
    @Position(startPosition = 25, endPosition = 26)
    private String tradeAgreementOrSpecialProgramClaimCode;
    @Position(startPosition = 27, endPosition = 36)
    private String chargesAmount;
    @Position(startPosition = 37, endPosition = 41)
    private String foreignPortOfLadingCode;
    @Position(startPosition = 42, endPosition = 51)
    private String grossShippingWeight;
    @Position(startPosition = 52, endPosition = 54)
    private String categoryCodeTextiles;
    @Position(startPosition = 55, endPosition = 55)
    private String productClaimCode;
    @Position(startPosition = 56, endPosition = 56)
    private String relatedPartyIndicator;
    @Position(startPosition = 57, endPosition = 57)
    private String naftaNetCostIndicator;
    @Position(startPosition = 58, endPosition = 58)
    private String feeExemptionCode;
    @Position(startPosition = 60, endPosition = 60)
    private String adCaseNonReimbursementStatement;
}
