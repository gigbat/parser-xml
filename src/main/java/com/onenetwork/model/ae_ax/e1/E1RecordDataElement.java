package com.onenetwork.model.ae_ax.e1;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class E1RecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 3)
    private String dispositionTypeCode;
    @Position(startPosition = 4, endPosition = 4)
    private String severityCode;
    @Position(startPosition = 5, endPosition = 7)
    private String conditionCode;
    @Position(startPosition = 8, endPosition = 10)
    private String reasonCode;
    @Position(startPosition = 11, endPosition = 50)
    private String narrativeText;
    @Position(startPosition = 51, endPosition = 53)
    private String entryFilerCode;
    @Position(startPosition = 56, endPosition = 63)
    private String entryNumber;
    @Position(startPosition = 64, endPosition = 68)
    private String versionNumber;
    @Position(startPosition = 69, endPosition = 77)
    private String brokerReferenceNumber;
}
