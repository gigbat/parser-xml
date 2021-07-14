package com.onenetwork.model.ae_ax.se;

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
    @Position(startPosition = 60, endPosition = 60)
    private String disIndicator;
}
