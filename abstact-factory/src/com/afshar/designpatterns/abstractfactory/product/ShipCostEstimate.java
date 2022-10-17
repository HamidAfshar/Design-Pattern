package com.afshar.designpatterns.abstractfactory.product;

public class ShipCostEstimate implements CostEstimate {
    @Override
    public int cost() {
        return 1000;
    }
}
