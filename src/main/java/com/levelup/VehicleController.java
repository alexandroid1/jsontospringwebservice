package com.levelup;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Александр on 28.07.2017.
 */

@RestController
public class VehicleController {

    @RequestMapping(value = "/")
    public ResponseEntity<Car> get() {

        Car car = new Car();
        car.setColor("Blue");
        car.setMiles(100);
        car.setVIN("1234");

        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<Car> update(@RequestBody Car car) {

        if (car != null) {
            car.setMiles(car.getMiles() + 100);
        }

        // TODO: call persistence layer to update
        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }

}
