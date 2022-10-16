package com.afshar.designpatterns.factorymethod.product;

public class RoadCostEstimate implements CostEstimate {
    @Override
    public int cost() {
        return 20000;
    }
}
