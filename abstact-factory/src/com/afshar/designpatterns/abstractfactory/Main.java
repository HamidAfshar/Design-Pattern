package com.afshar.designpatterns.abstractfactory;

import com.afshar.designpatterns.abstractfactory.product.CostEstimate;
import com.afshar.designpatterns.abstractfactory.product.Transport;

public class Main {
    public static void main(String[] args) {
        LogisticsFactory factory = FactoryProducer.getFactory(LogisticsType.Sea);

        Transport transport = factory.createLogistic();
        CostEstimate costEstimate = factory.createCostEstimate();

        System.out.printf(String.format("result : %s , with %d estimated cost", transport.deliver(), costEstimate.cost()));
    }
}