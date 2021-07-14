package com.onenetwork.model.ae_ax.numbers;

import com.onenetwork.model.Position;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ThirtyRecordDataElement {
    @Position(startPosition = 1, endPosition = 2)
    private String controlIdentifier;
    @Position(startPosition = 3, endPosition = 5)
    private String associatedWarehouseEntryFilerCode;
    @Position(startPosition = 8, endPosition = 15)
    private String associatedWarehouseEntryNumber;
    @Position(startPosition = 17, endPosition = 20)
    private String associatedWarehouseEntryDistrictOrPortCode;
    @Position(startPosition = 21, endPosition = 21)
    private String finalWarehouseWithdrawalIndicator;
}
