package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TenRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 3)
    private String summaryFilingActionRequestCode;
    @Position(startPosition = 4, endPosition = 6)
    private String entryFilerCode;
    @Position(startPosition = 9, endPosition = 16)
    private String entryNumber;
    @Position(startPosition = 18, endPosition = 21)
    private String districtOrPortOfEntry;
    @Position(startPosition = 22, endPosition = 30)
    private String brokerReferenceNumber;
    @Position(startPosition = 34, endPosition = 35)
    private String entryTypeCode;
    @Position(startPosition = 36, endPosition = 37)
    private String modeOfTransportationCode;
    @Position(startPosition = 38, endPosition = 38)
    private String bondWaiverIndicator;
    @Position(startPosition = 39, endPosition = 39)
    private String electronicSignature;
    @Position(startPosition = 40, endPosition = 40)
    private String cargoReleaseCertificationRequestIndicator;
    @Position(startPosition = 41, endPosition = 41)
    private String electronicInvoiceIndicator;
    @Position(startPosition = 42, endPosition = 42)
    private String consolidatedSummaryIndicator;
    @Position(startPosition = 43, endPosition = 43)
    private String shipmentUsageTypeCode;
    @Position(startPosition = 44, endPosition = 44)
    private String liveEntryIndicator;
    @Position(startPosition = 45, endPosition = 45)
    private String deferredTaxPaymentCode;
    @Position(startPosition = 46, endPosition = 46)
    private String tradeAgreementReconciliationIndicator;
    @Position(startPosition = 47, endPosition = 49)
    private String reconciliationIssueCode;
    @Position(startPosition = 51, endPosition = 51)
    private String paymentTypeCode;
    @Position(startPosition = 52, endPosition = 57)
    private String preliminaryStatementPrintDate;
    @Position(startPosition = 58, endPosition = 59)
    private String periodicStatementMonth;
    @Position(startPosition = 60, endPosition = 61)
    private String statementClientBranchIdentifier;
    @Position(startPosition = 62, endPosition = 64)
    private String bondWaiverReasonCode;
    @Position(startPosition = 65, endPosition = 65)
    private String postSummaryCorrectionIndicator;
    @Position(startPosition = 66, endPosition = 66)
    private String acceleratedLiquidationRequestIndicator;
    @Position(startPosition = 67, endPosition = 67)
    private String knownImporterIndicator;
    @Position(startPosition = 68, endPosition = 68)
    private String pgaDataIncludedIndicator;
    @Position(startPosition = 69, endPosition = 69)
    private String tibDeclarationIndicator;
}
