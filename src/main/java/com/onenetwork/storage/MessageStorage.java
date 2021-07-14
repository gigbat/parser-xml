package com.onenetwork.storage;

import com.onenetwork.response.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MessageStorage {
    private final String path;
    private final ResponseMessage responseMessage;
}
