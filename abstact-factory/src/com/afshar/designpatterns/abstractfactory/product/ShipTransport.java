package com.afshar.designpatterns.abstractfactory.product;

public class ShipTransport implements Transport {
    @Override
    public String deliver() {
        return "Product delivered by Ship !";
    }
}
