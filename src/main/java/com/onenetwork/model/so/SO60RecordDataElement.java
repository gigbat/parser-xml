package com.onenetwork.model.so;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SO60RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 10)
    private String dispositionActionDate;
    @Position(startPosition = 11, endPosition = 14)
    private String dispositionActionTime;
    @Position(startPosition = 15, endPosition = 16)
    private String dispositionActionCode;
    @Position(startPosition = 17, endPosition = 56)
    private String narrativeMessage;
    @Position(startPosition = 57, endPosition = 62)
    private String releaseDate;
    @Position(startPosition = 63, endPosition = 64)
    private String releaseOriginCode;
    @Position(startPosition = 65, endPosition = 70)
    private String documentType;
}
