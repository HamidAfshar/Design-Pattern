package com.afshar.designpatterns.factorymethod;

import com.afshar.designpatterns.factorymethod.product.CostEstimate;
import com.afshar.designpatterns.factorymethod.product.ShipCostEstimate;
import com.afshar.designpatterns.factorymethod.product.ShipTransport;
import com.afshar.designpatterns.factorymethod.product.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createLogistic() {
        return new ShipTransport();
    }

    @Override
    public CostEstimate createCostEstimate() {
        return new ShipCostEstimate();
    }
}
