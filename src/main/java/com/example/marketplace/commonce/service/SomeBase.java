package com.example.marketplace.commonce.service;

import java.util.HashMap;
import java.util.Map;

public class SomeBase {
    public static Map<String,Object> myBase() {
        Map<String,Object> baseData = new HashMap<>();
        baseData.put("userId", 1);
        baseData.put("itemId", 1);
        baseData.put("countItem", 1.0);
        return baseData;
    }
}
