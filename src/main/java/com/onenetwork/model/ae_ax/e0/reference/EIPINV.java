package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EIPINV {
    @Position(startPosition = 26, endPosition = 40)
    private String supplierIdCode;
    @Position(startPosition = 42, endPosition = 58)
    private String invoiceNumber;
}
