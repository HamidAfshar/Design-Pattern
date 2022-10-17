package com.afshar.designpatterns.abstractfactory;

import com.afshar.designpatterns.abstractfactory.product.CostEstimate;
import com.afshar.designpatterns.abstractfactory.product.ShipCostEstimate;
import com.afshar.designpatterns.abstractfactory.product.ShipTransport;
import com.afshar.designpatterns.abstractfactory.product.Transport;

public class SeaLogisticsFactory extends LogisticsFactory {
    @Override
    public Transport createLogistic() {
        return new ShipTransport();
    }

    @Override
    public CostEstimate createCostEstimate() {
        return new ShipCostEstimate();
    }
}
