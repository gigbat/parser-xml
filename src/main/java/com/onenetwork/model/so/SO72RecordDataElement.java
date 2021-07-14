package com.onenetwork.model.so;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SO72RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 80)
    private String commentsToTradeFromPga;
}
