package com.afshar.designpatterns.factorymethod.product;

public class ShipCostEstimate implements CostEstimate {
    @Override
    public int cost() {
        return 1000;
    }
}
