package com.onenetwork.model.ae_ax.cw;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CW02RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 10, endPosition = 12)
    private String censusWarningConditionCodeFirst;
    @Position(startPosition = 13, endPosition = 14)
    private String censusWarningConditionOverrideCodeFirst;
    @Position(startPosition = 15, endPosition = 17)
    private String censusWarningConditionCodeSecond;
    @Position(startPosition = 18, endPosition = 19)
    private String censusWarningConditionOverrideCodeSecond;
    @Position(startPosition = 20, endPosition = 22)
    private String censusWarningConditionCodeThird;
    @Position(startPosition = 23, endPosition = 24)
    private String censusWarningConditionOverrideCodeThird;
    @Position(startPosition = 25, endPosition = 27)
    private String censusWarningConditionCodeFourth;
    @Position(startPosition = 28, endPosition = 29)
    private String censusWarningConditionOverrideCodeFourth;
    @Position(startPosition = 30, endPosition = 32)
    private String censusWarningConditionCodeFifth;
    @Position(startPosition = 33, endPosition = 34)
    private String censusWarningConditionOverrideCodeFifth;
    @Position(startPosition = 35, endPosition = 37)
    private String censusWarningConditionCodeSixth;
    @Position(startPosition = 38, endPosition = 39)
    private String censusWarningConditionOverrideCodeSixth;
    @Position(startPosition = 40, endPosition = 42)
    private String censusWarningConditionCodeSeventh;
    @Position(startPosition = 43, endPosition = 44)
    private String censusWarningConditionOverrideCodeSeventh;
}
