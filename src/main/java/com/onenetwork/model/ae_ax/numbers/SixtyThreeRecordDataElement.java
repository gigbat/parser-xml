package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SixtyThreeRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 5)
    private String postSummaryCorrectionLineReasonCodeFirst;
    @Position(startPosition = 6, endPosition = 8)
    private String postSummaryCorrectionLineReasonCodeSecond;
    @Position(startPosition = 9, endPosition = 11)
    private String postSummaryCorrectionLineReasonCodeThird;
    @Position(startPosition = 12, endPosition = 14)
    private String postSummaryCorrectionLineReasonCodeFourth;
    @Position(startPosition = 15, endPosition = 17)
    private String postSummaryCorrectionLineReasonCodeFifth;
}
