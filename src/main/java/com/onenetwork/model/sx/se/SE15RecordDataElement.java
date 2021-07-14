package com.onenetwork.model.sx.se;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SE15RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 5)
    private String billTypeIndicator;
    @Position(startPosition = 6, endPosition = 9)
    private String issuerCodeOfBillOfLadingNumber;
    @Position(startPosition = 10, endPosition = 59)
    private String billOfLadingNumber;
    @Position(startPosition = 60, endPosition = 67)
    private String quantity;
    @Position(startPosition = 73, endPosition = 73)
    private String nonAmsIndicator;
}
