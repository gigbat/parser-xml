package com.onenetwork.model.ae_ax.e0.reference;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SUMMRY {
    @Position(startPosition = 26, endPosition = 28)
    private String entryFilerCode;
    @Position(startPosition = 30, endPosition = 37)
    private String entryNumber;
    @Position(startPosition = 39, endPosition = 50)
    private String brokerReferenceNumber;
    @Position(startPosition = 52, endPosition = 54)
    private String cbpTeamNumber;
}
