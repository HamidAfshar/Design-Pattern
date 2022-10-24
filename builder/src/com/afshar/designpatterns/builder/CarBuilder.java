package com.afshar.designpatterns.builder;

import com.afshar.designpatterns.builder.cars.Car;
import com.afshar.designpatterns.builder.cars.CarType;
import com.afshar.designpatterns.builder.component.Engine;
import com.afshar.designpatterns.builder.component.GPSNavigator;
import com.afshar.designpatterns.builder.component.Transmission;
import com.afshar.designpatterns.builder.component.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Builder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public Builder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
