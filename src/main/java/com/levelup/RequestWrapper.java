package com.levelup;

import java.util.List;

/**
 * Created by Александр on 28.07.2017.
 */
public class RequestWrapper {

    List<Car> cars;
    Truck truck;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

}
