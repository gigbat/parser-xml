package com.onenetwork.starter;

import com.onenetwork.parser.LineParser;
import com.onenetwork.response.ResponseMessage;
import com.onenetwork.storage.MessageStorage;
import com.onenetwork.util.XmlExtractor;

import java.util.List;

public class XmlStarter {
    public static void main(String[] args) {
        List<MessageStorage> storages = XmlExtractor.extract();
        LineParser lineParser = new LineParser();
        for (MessageStorage storage : storages) {
            ResponseMessage responseMessage = storage.getResponseMessage();
            if (responseMessage != null) {
                List<Object> models = lineParser.getModels(responseMessage);
            }
        }
        System.out.println();
    }
}
