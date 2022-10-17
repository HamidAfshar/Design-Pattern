package com.afshar.designpatterns.abstractfactory.product;

public class RoadCostEstimate implements CostEstimate {
    @Override
    public int cost() {
        return 20000;
    }
}
