package com.afshar.designpatterns.abstractfactory;

import com.afshar.designpatterns.abstractfactory.product.CostEstimate;
import com.afshar.designpatterns.abstractfactory.product.Transport;

public abstract class LogisticsFactory {
    public abstract Transport createLogistic();

    public abstract CostEstimate createCostEstimate();
}
