package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FiftyTwoRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 4)
    private String licenseOrCertificateOrPermitTypeCode;
    @Position(startPosition = 5, endPosition = 14)
    private String licenseNumberOrCertificateNumberOrPermitNumber;
}
