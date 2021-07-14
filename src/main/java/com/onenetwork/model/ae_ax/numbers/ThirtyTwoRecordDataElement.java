package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ThirtyTwoRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 5)
    private String releaseEntryFilerCodeFirst;
    @Position(startPosition = 8, endPosition = 15)
    private String releaseEntryNumberFirst;
    @Position(startPosition = 16, endPosition = 18)
    private String releaseEntryFilerCodeSecond;
    @Position(startPosition = 21, endPosition = 28)
    private String releaseEntryNumberSecond;
    @Position(startPosition = 29, endPosition = 31)
    private String releaseEntryFilerCodeThird;
    @Position(startPosition = 34, endPosition = 41)
    private String releaseEntryNumberThird;
    @Position(startPosition = 42, endPosition = 44)
    private String releaseEntryFilerCodeFourth;
    @Position(startPosition = 47, endPosition = 54)
    private String releaseEntryNumberFourth;
    @Position(startPosition = 55, endPosition = 57)
    private String releaseEntryFilerCodeFifth;
    @Position(startPosition = 60, endPosition = 67)
    private String releaseEntryNumberFifth;
    @Position(startPosition = 68, endPosition = 70)
    private String releaseEntryFilerCodeSixth;
    @Position(startPosition = 73, endPosition = 80)
    private String releaseEntryNumberSixth;
}
