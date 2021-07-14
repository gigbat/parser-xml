package com.onenetwork.model.sn_us_isf10;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SF90RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 6)
    private String messageTypeCode;
    @Position(startPosition = 7, endPosition = 9)
    private String errorCode;
    @Position(startPosition = 10, endPosition = 49)
    private String narrativeMessageText;
}
