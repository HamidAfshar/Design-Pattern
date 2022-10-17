package com.afshar.designpatterns.abstractfactory;

public class FactoryProducer {
    public static LogisticsFactory getFactory(LogisticsType type) {
        return switch (type) {
            case Sea -> new SeaLogisticsFactory();
            case Road -> new RoadLogisticsFactory();
        };
    }
}
