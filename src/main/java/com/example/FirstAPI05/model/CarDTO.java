package com.example.FirstAPI05.model;

import javax.validation.constraints.NotBlank;

/**
 * @author Drumstyle92
 * DTO(Data Transfer Object) class containing characteristics of a car.
 */
public class CarDTO {
    /**
     * Car id variable and with "mandatory" annotation.
     */
    @NotBlank(message = "Mandatory")
    private String id;
    /**
     * Variable of the car model and with obligatory annotation.
     */
    @NotBlank(message = "Mandatory")
    private String modelName;
    /**
     * variable with the cost of the car.
     */
    private double price;

    /**
     * @param id Parameter of the car id that we are going to insert.
     * @param modelName Parameter of the car model that we are going to insert.
     * @param price Parameter of the cost of the car that we are going to insert.
     * Constructor method with which by creating the instance object of the class we enter the chosen parameters.
     */
    public CarDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    /**
     * @return returns the car id
     * method used for encapsulation.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id Car id parameter.
     * method used for encapsulation.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the model of the car returns
     * method used for encapsulation.
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName  Car model parameter.
     * method used for encapsulation.
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return The cost of the car returns
     * method used for encapsulation.
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price Car cost parameter.
     * method used for encapsulation.
     */
    public void setPrice(double price) {
        this.price = price;
    }

}
