package com.afshar.designpatterns.factorymethod;

import com.afshar.designpatterns.factorymethod.product.CostEstimate;
import com.afshar.designpatterns.factorymethod.product.RoadCostEstimate;
import com.afshar.designpatterns.factorymethod.product.Transport;
import com.afshar.designpatterns.factorymethod.product.TruckTransport;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createLogistic() {
        return new TruckTransport();
    }

    @Override
    public CostEstimate createCostEstimate() {
        return new RoadCostEstimate();
    }
}
