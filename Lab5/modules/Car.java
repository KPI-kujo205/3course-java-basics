package Lab5.modules;

import Lab5.modules.InvalidCarException;

/**
 * A base class representing a general car with basic attributes.
 * This class serves as a foundation for various types of cars,
 * encapsulating common properties like brand, model, price,
 * fuel consumption, and maximum speed.
 */
public abstract class Car {
    private String brand;
    private String model;
    private double price;
    private double fuelConsumption; // in liters per 100 km
    private int maxSpeed; // in km/h


    /**
     * Constructs a new Car with the specified attributes.
     *
     * @param brand the brand of the car
     * @param model the model of the car
     * @param price the price of the car in dollars
     * @param fuelConsumption the fuel consumption of the car in liters per 100 km
     * @param maxSpeed the maximum speed of the car in km/h
     */
    public Car(String brand, String model, double price, double fuelConsumption, int maxSpeed)
            throws InvalidCarException {
        if (price < 0 || fuelConsumption < 0 || maxSpeed < 0) {
            throw new InvalidCarException("Car attributes must be non-negative.");
        }
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Returns the price of the car.
     *
     * @return the car's price in dollars
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the fuel consumption of the car.
     *
     * @return the car's fuel consumption in liters per 100 km
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Returns the maximum speed of the car.
     *
     * @return the car's maximum speed in km/h
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Returns a string representation of the car, including its brand, model,
     * price, fuel consumption, and maximum speed.
     *
     * @return a string describing the car
     */
    @Override
    public String toString() {
        return brand + " " + model + " (Price: " + price + ", Fuel Consumption: " + fuelConsumption
                + " L/100km, Max Speed: " + maxSpeed + " km/h)";
    }
}

