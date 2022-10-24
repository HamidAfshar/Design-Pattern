package com.afshar.designpatterns.builder;


import com.afshar.designpatterns.builder.cars.CarType;
import com.afshar.designpatterns.builder.component.Engine;
import com.afshar.designpatterns.builder.component.GPSNavigator;
import com.afshar.designpatterns.builder.component.Transmission;
import com.afshar.designpatterns.builder.component.TripComputer;

public interface Builder {
    Builder setCarType(CarType type);

    Builder setSeats(int seats);

    Builder setEngine(Engine engine);

    Builder setTransmission(Transmission transmission);
    Builder setTripComputer(TripComputer tripComputer);

    Builder setGPSNavigator(GPSNavigator gpsNavigator);
}
