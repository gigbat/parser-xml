package com.onenetwork.model.sx.sf;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SF10RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 5)
    private String isfSubmissionType;
    @Position(startPosition = 6, endPosition = 7)
    private String shipmentTypeCode;
    @Position(startPosition = 8, endPosition = 8)
    private String actionCode;
    @Position(startPosition = 9, endPosition = 10)
    private String actionReasonCode;
    @Position(startPosition = 11, endPosition = 13)
    private String isfImporterNumberQualifier;
    @Position(startPosition = 14, endPosition = 28)
    private String isfImporterNumber;
    @Position(startPosition = 29, endPosition = 36)
    private String reserved;
    @Position(startPosition = 37, endPosition = 38)
    private String modeOfTransportationCode;
    @Position(startPosition = 39, endPosition = 53)
    private String isfTransactionNumber;
    @Position(startPosition = 54, endPosition = 57)
    private String scasIdentifier;
    @Position(startPosition = 58, endPosition = 72)
    private String bondHolder;
    @Position(startPosition = 73, endPosition = 74)
    private String bondActivityCode;
    @Position(startPosition = 75, endPosition = 75)
    private String bondType;
    @Position(startPosition = 79, endPosition = 80)
    private String countryOfIssuance;
}
