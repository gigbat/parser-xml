package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ThirtyOneRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 3)
    private String bondTypeCode;
    @Position(startPosition = 4, endPosition = 4)
    private String bondDesignationTypeCode;
    @Position(startPosition = 5, endPosition = 5)
    private String continuousBondIndicator;
    @Position(startPosition = 6, endPosition = 8)
    private String suretyCompanyCode;
    @Position(startPosition = 9, endPosition = 18)
    private String singleTransactionBondAmount;
    @Position(startPosition = 19, endPosition = 28)
    private String singleTransactionBondProducerAccountNumber;
}
