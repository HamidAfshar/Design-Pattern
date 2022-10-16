package com.afshar.designpatterns.factorymethod;

import com.afshar.designpatterns.factorymethod.product.CostEstimate;
import com.afshar.designpatterns.factorymethod.product.Transport;

public class Main {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();

        Transport transport = logistics.createLogistic();
        CostEstimate costEstimate = logistics.createCostEstimate();

        System.out.printf(String.format("result : %s , with %d estimated cost", transport.deliver(), costEstimate.cost()));
    }
}