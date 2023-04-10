package com.example.marketplace.commonce.service;

public class Person {
    private Integer id;
    private String name;
    private Integer itemId;
    private Double countItem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Double getCountItem() {
        return countItem;
    }

    public void setCountItem(Double countItem) {
        this.countItem = countItem;
    }

    public Person(Integer id, String name, Integer itemId, Double countItem) {
        this.id = id;
        this.name = name;
        this.itemId = itemId;
        this.countItem = countItem;
    }
}
