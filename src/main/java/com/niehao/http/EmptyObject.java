package com.niehao.http;

import java.util.HashMap;

public class EmptyObject extends HashMap<String, Object> {

    private static final EmptyObject PRESENT = new EmptyObject();

    public static EmptyObject EMPTY_OBJECT() {
        return PRESENT;
    }

}
