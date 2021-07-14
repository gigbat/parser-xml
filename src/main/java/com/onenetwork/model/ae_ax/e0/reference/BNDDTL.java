package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BNDDTL {
    @Position(startPosition = 26, endPosition = 26)
    private String bondTypeCode;
    @Position(startPosition = 28, endPosition = 28)
    private String bondDesignationTypeCode;
    @Position(startPosition = 30, endPosition = 32)
    private String suretyCompanyCode;
}
