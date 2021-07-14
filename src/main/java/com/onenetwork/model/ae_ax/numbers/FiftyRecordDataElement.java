package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FiftyRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 12)
    private String htsNumber;
    @Position(startPosition = 14, endPosition = 23)
    private String dutyAmount;
    @Position(startPosition = 25, endPosition = 34)
    private String valueOfGoodsAmount;
    @Position(startPosition = 36, endPosition = 47)
    private String quantityFirst;
    @Position(startPosition = 48, endPosition = 50)
    private String unitOfMeasureCodeFirst;
    @Position(startPosition = 51, endPosition = 62)
    private String quantitySecond;
    @Position(startPosition = 63, endPosition = 65)
    private String unitOfMeasureCodeSecond;
    @Position(startPosition = 66, endPosition = 67)
    private String quantityThird;
    @Position(startPosition = 78, endPosition = 80)
    private String unitOfMeasureCodeThird;
}
