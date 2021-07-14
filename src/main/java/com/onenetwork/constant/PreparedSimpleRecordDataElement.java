package com.onenetwork.constant;

import com.onenetwork.model.SimpleControlIdentifier;
import com.onenetwork.model.entry_validate.EntryValidate;
import com.onenetwork.model.isf_validate.ISFModel;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import static com.onenetwork.constant.TypeConstant.TYPE_ENTRY_VALIDATE;
import static com.onenetwork.constant.TypeConstant.TYPE_ISF_VALIDATE;

public class PreparedSimpleRecordDataElement {

    private static final Map<String, BiFunction<SimpleControlIdentifier, String, Object>>
            SERVICE_SIMPLE_RECORD_DATA_ELEMENT = new HashMap<>(2);

    static {
        SERVICE_SIMPLE_RECORD_DATA_ELEMENT.put(TYPE_ISF_VALIDATE, (s, m) -> {
            String symbol = s.getSymbol();
            String symbolDescription = s.getDescription();
            return new ISFModel(symbol, symbolDescription, m);
        });
        SERVICE_SIMPLE_RECORD_DATA_ELEMENT.put(TYPE_ENTRY_VALIDATE, (s, m) -> {
            String symbol = s.getSymbol();
            String symbolDescription = s.getDescription();
            return new EntryValidate(symbol, symbolDescription, m);
        });
    }

    public static final Map<String, BiFunction<SimpleControlIdentifier, String, Object>> SIMPLE_RECORD_DATA_ELEMENT =
            Collections.unmodifiableMap(SERVICE_SIMPLE_RECORD_DATA_ELEMENT);
}
