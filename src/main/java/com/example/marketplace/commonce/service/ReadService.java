package com.example.marketplace.commonce.service;

import jakarta.annotation.Nullable;

public interface ReadService <K,V>{
    @Nullable
    V get (K key);
}
