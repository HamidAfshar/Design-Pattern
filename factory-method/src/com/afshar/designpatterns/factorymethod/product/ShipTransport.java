package com.afshar.designpatterns.factorymethod.product;

public class ShipTransport implements Transport {
    @Override
    public String deliver() {
        return "Product delivered by Ship !";
    }
}
