package com.example.FirstAPI05.controller;

import com.example.FirstAPI05.model.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

/**
 * @author Drumstyle92
 * Controller class that contains the CRUD of the program.
 */
@RestController
@RequestMapping("/cars")
public class CarController {
    /**
     * @return Returns a CarDTO object with the entered parameters.
     * get method which returns the printout of the instance of the CarDTO class.
     */
    @GetMapping
    public CarDTO getCars(){

        return new CarDTO("1","Fiat",4000);

    }

    /**
     * @param car main parameter
     * It returns the body containing the information of the instance of the entered class or,
     * if there was an error, an obligatory exception.
     * Post method with body as response entered by us.
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String postCar(@Valid @RequestBody(required = false) CarDTO car) {

        return car.getId() + " " + car.getModelName() + " " + car.getPrice();

    }

}
