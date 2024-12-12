package Lab5.modules;

/**
 * Represents a truck, a type of motor vehicle designed to transport cargo.
 */
public class Truck extends Car {
    /**
     * Constructs a new Truck with specified attributes.
     *
     * @param brand the brand of the truck
     * @param model the model of the truck
     * @param price the price of the truck in dollars
     * @param fuelConsumption the fuel consumption of the truck in liters per 100 km
     * @param maxSpeed the maximum speed of the truck in km/h
     */
    public Truck(String brand, String model, double price, double fuelConsumption, int maxSpeed)
            throws InvalidCarException {
        super(brand, model, price, fuelConsumption, maxSpeed);
    }
}
