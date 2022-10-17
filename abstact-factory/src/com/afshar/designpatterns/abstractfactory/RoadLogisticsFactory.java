package com.afshar.designpatterns.abstractfactory;

import com.afshar.designpatterns.abstractfactory.product.CostEstimate;
import com.afshar.designpatterns.abstractfactory.product.RoadCostEstimate;
import com.afshar.designpatterns.abstractfactory.product.Transport;
import com.afshar.designpatterns.abstractfactory.product.TruckTransport;

public class RoadLogisticsFactory extends LogisticsFactory {
    @Override
    public Transport createLogistic() {
        return new TruckTransport();
    }

    @Override
    public CostEstimate createCostEstimate() {
        return new RoadCostEstimate();
    }
}
