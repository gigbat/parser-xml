package com.onenetwork.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PackagePathConstant {
    WEBSERVICE("com.onenetwork.webservice"),
    RESPONSE("com.onenetwork.response");

    private final String path;
}
