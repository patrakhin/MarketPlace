package com.example.marketplace.service;

import com.example.marketplace.commonce.service.BaseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class ServiceTest {
    @Autowired
    private BaseService service;

    @Test
    public void addToCard(){
        Map<String,Object> map = new HashMap<>();
        map.put("userId", 1);
        map.put("itemId", 1);
        map.put("countItem", 1.0);
        Boolean execute = (Boolean)service.execute(map);
        Assertions.assertTrue(execute);
    }

    @Test
    public void deleteCard(){
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 1);
        map.put("itemId", 1);
        map.put("countItem", 0.5);
        Double deleteItem = (Double) service.execute(map);
        Assertions.assertEquals(0.5,deleteItem);
    }

    @Test
    public void payItem() {
        Integer userId = 1;
        Double price = (Double) service.execute(userId);
        Assertions.assertEquals(135.0, price);
    }
}
