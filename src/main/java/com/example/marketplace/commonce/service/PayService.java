package com.example.marketplace.commonce.service;

public class PayService implements BaseService {
    private static final Integer USER_ID =  1;

    @Override
    public Object execute(Object input) {
        if (SomeBase.myBase().get("userId") != USER_ID) {return 0.0;}
        return (((Double) SomeBase.myBase().get("countItem")) * ((Double)SomeBase.myBase().get("itemId")));
    }

}
