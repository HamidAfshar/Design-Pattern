package com.afshar.designpatterns.factorymethod.product;

public class TruckTransport implements Transport {
    @Override
    public String deliver() {
        return "Product delivered by Road !";
    }
}
