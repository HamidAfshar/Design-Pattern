package com.afshar.designpatterns.factorymethod;

import com.afshar.designpatterns.factorymethod.product.CostEstimate;
import com.afshar.designpatterns.factorymethod.product.Transport;

public abstract class Logistics {
    public abstract Transport createLogistic();

    public abstract CostEstimate createCostEstimate();
}
