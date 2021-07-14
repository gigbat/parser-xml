package com.onenetwork.model.sx.sf;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SF31RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 7)
    private String entityCode;
    @Position(startPosition = 8, endPosition = 42)
    private String entityName;
}
