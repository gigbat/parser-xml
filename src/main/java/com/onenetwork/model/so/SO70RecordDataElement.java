package com.onenetwork.model.so;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SO70RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 7)
    private String governmentAgencyCode;
    @Position(startPosition = 8, endPosition = 10)
    private String governmentAgencyProgramCode;
    @Position(startPosition = 11, endPosition = 16)
    private String statusActionDate;
    @Position(startPosition = 17, endPosition = 20)
    private String statusActionTime;
    @Position(startPosition = 21, endPosition = 22)
    private String pgaEntryLevelStatusCode;
    @Position(startPosition = 23, endPosition = 50)
    private String pgaEntryLevelStatusMessage;
    @Position(startPosition = 51, endPosition = 52)
    private String entryLineLevelStatusCode;
    @Position(startPosition = 53, endPosition = 54)
    private String pgaLineLevelStatusCode;
    @Position(startPosition = 55, endPosition = 56)
    private String statusReasonCode;
    @Position(startPosition = 57, endPosition = 60)
    private String beginningCbpLine;
    @Position(startPosition = 61, endPosition = 61)
    private String beginningTariffPosition;
    @Position(startPosition = 62, endPosition = 64)
    private String beginningPgaLine;
    @Position(startPosition = 65, endPosition = 68)
    private String endingCbpLine;
    @Position(startPosition = 69, endPosition = 69)
    private String endingTariffPosition;
    @Position(startPosition = 70, endPosition = 72)
    private String endingPgaLine;
    @Position(startPosition = 73, endPosition = 77)
    private String documentTypeCode;
    @Position(startPosition = 78, endPosition = 78)
    private String pgaEntryHoldType;
    @Position(startPosition = 79, endPosition = 80)
    private String pgaProcessingGroupVersion;
}
