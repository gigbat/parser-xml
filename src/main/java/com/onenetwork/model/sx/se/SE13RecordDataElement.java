package com.onenetwork.model.sx.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE13RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 44)
    private String contactName;
    @Position(startPosition = 45, endPosition = 59)
    private String contactPhone;
    @Position(startPosition = 60, endPosition = 61)
    private String reasonCode;
    @Position(startPosition = 62, endPosition = 62)
    private String multipleCargoDispositionsIndicator;
    @Position(startPosition = 63, endPosition = 63)
    private String disIndicator;
    @Position(startPosition = 64, endPosition = 64)
    private String splitShipmentIndicator;
}
