package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ThirtyFiveRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 5)
    private String postSummaryCorrectionHeaderReasonCodeFirst;
    @Position(startPosition = 6, endPosition = 8)
    private String postSummaryCorrectionHeaderReasonCodeSecond;
    @Position(startPosition = 9, endPosition = 11)
    private String postSummaryCorrectionHeaderReasonCodeThird;
    @Position(startPosition = 12, endPosition = 14)
    private String postSummaryCorrectionHeaderReasonCodeFourth;
    @Position(startPosition = 15, endPosition = 17)
    private String postSummaryCorrectionHeaderReasonCodeFifth;
}
