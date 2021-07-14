package com.onenetwork.model.sx.sf;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SF36RecordDataElement {
    @Position(startPosition = 1, endPosition = 4)
    private String controlIdentifier;
    @Position(startPosition = 5, endPosition = 39)
    private String cityName;
    @Position(startPosition = 40, endPosition = 42)
    private String countrySubEntityCode;
    @Position(startPosition = 49, endPosition = 63)
    private String postalCode;
    @Position(startPosition = 64, endPosition = 65)
    private String countryCode;
}
