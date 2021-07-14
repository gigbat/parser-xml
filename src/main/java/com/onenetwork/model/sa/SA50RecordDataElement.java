package com.onenetwork.model.sa;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SA50RecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 4)
    private String recordType;
    @Position(startPosition = 5, endPosition = 6)
    private String dispositionCode;
    @Position(startPosition = 7, endPosition = 46)
    private String remarks;
}
