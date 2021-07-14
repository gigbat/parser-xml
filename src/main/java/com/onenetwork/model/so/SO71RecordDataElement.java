package com.onenetwork.model.so;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SO71RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 6)
    private String pgaReferenceIdentificationNumberQualifier;
    @Position(startPosition = 7, endPosition = 18)
    private String pgaReferenceIdentificationNumberFirst;
    @Position(startPosition = 19, endPosition = 24)
    private String pgaReferenceIdentificationNumberReceiptDate;
    @Position(startPosition = 25, endPosition = 30)
    private String pgaReferenceIdentificationNumberReceiptTime;
    @Position(startPosition = 31, endPosition = 33)
    private String pgaLineSubReasonCodeFirst;
    @Position(startPosition = 34, endPosition = 36)
    private String pgaLineSubReasonCodeSecond;
    @Position(startPosition = 37, endPosition = 39)
    private String pgaLineSubReasonCodeThird;
    @Position(startPosition = 40, endPosition = 42)
    private String pgaLineSubReasonCodeFourth;
    @Position(startPosition = 43, endPosition = 45)
    private String pgaLineSubReasonCodeFifth;
    @Position(startPosition = 46, endPosition = 48)
    private String pgaLineSubReasonCodeSixth;
    @Position(startPosition = 49, endPosition = 51)
    private String pgaLineSubReasonCodeSeventh;
    @Position(startPosition = 52, endPosition = 54)
    private String pgaLineSubReasonCodeEighth;
    @Position(startPosition = 55, endPosition = 57)
    private String pgaLineSubReasonCodeNinth;
    @Position(startPosition = 58, endPosition = 60)
    private String pgaLineSubReasonCodeTenth;
    @Position(startPosition = 61, endPosition = 62)
    private String pgaLineSubReasonCodeEleventh;
    @Position(startPosition = 63, endPosition = 80)
    private String pgaReferenceIdentificationNumberSecond;
}
