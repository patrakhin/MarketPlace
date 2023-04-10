package com.example.marketplace.commonce.service;

import java.util.*;

public class SomeBase {
    private   List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(1, "Nikita", 9, 2.0));
        people.add(new Person(2, "Andrew", 12, 1.5));
    }

    public List<Person> index() {
        return people;
    }

    public Person show (int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

/*    public static Map<String,Object> myBase() {
        Map<String,Object> baseData = new HashMap<>();
        baseData.put("userId", 1);
        baseData.put("itemId", 1);
        baseData.put("countItem", 1.0);
        return baseData;
    }*/
}
