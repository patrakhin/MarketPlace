package com.example.marketplace.commonce.service;

public interface BaseService<Input, Output> {
    Output execute(Input input);
}
