package com.afshar.designpatterns.builder.component;

import com.afshar.designpatterns.builder.cars.Car;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class TripComputer {

    private Car car;


    public void showFuelLevel(){
        System.out.printf("Fuel Level : " + car.getFuel());
    }

    public void showStatus(){
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        }else{
            System.out.println("Car isn't started");
        }
    }
}
