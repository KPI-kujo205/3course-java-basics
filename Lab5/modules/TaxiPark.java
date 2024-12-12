package Lab5.modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Represents a taxi park, a collection of various cars used for taxi services.
 * The class provides functionalities to manage cars, calculate the total value
 * of the fleet, sort cars by fuel consumption, and find cars by speed range.
 */
public class TaxiPark {
    private List<Car> cars = new ArrayList<>();

    /**
     * Adds a car to the taxi park.
     *
     * @param car the car to be added
     * @throws InvalidCarException if the car is null
     */
    public void addCar(Car car) throws InvalidCarException {
        if (car == null) {
            throw new InvalidCarException("Cannot add a null car to the taxi park.");
        }
        cars.add(car);
    }

    /**
     * Calculates the total value of all cars in the taxi park.
     *
     * @return the total price of all cars
     */
    public double calculateTotalValue() {
        double totalValue = 0;
        for (Car car : cars) {
            totalValue += car.getPrice();
        }
        return totalValue;
    }

    /**
     * Sorts the cars in the taxi park by their fuel consumption in ascending order.
     */
    public void sortCarsByFuelConsumption() {
        Collections.sort(cars, Comparator.comparingDouble(Car::getFuelConsumption));
    }

    /**
     * Finds and returns a list of cars that have a maximum speed within the specified range.
     *
     * @param minSpeed the minimum speed for the search range in km/h
     * @param maxSpeed the maximum speed for the search range in km/h
     * @return a list of cars with speeds within the specified range
     */
    public List<Car> findCarsBySpeedRange(int minSpeed, int maxSpeed) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                result.add(car);
            }
        }
        return result;
    }

    /**
     * Returns a string representation of the taxi park, listing all cars.
     *
     * @return a string describing the cars in the taxi park
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Taxi Park:\n");
        for (Car car : cars) {
            sb.append(car.toString()).append("\n");
        }
        return sb.toString();
    }
}

