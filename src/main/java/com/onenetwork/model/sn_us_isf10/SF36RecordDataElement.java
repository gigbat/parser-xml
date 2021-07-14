package com.onenetwork.model.sn_us_isf10;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SF36RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 6)
    private String addressComponentQualifierFirst;
    @Position(startPosition = 7, endPosition = 41)
    private String addressInformationFist;
    @Position(startPosition = 42, endPosition = 43)
    private String addressComponentQualifierSecond;
    @Position(startPosition = 44, endPosition = 78)
    private String addressInformationSecond;
}
