package com.onenetwork.model.sx.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE90RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 6)
    private String messageTypeCode;
    @Position(startPosition = 7, endPosition = 9)
    private String messageIdentifierCode;
    @Position(startPosition = 10, endPosition = 49)
    private String narrativeMessageText;
}
