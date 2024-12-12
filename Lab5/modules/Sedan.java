package Lab5.modules;

/**
 * Represents a sedan, a type of passenger car that typically has a three-box configuration with
 * separate compartments for engine, passenger, and cargo.
 */
public class Sedan extends Car {
    /**
     * Constructs a new Sedan with specified attributes.
     *
     * @param brand the brand of the sedan
     * @param model the model of the sedan
     * @param price the price of the sedan in dollars
     * @param fuelConsumption the fuel consumption of the sedan in liters per 100 km
     * @param maxSpeed the maximum speed of the sedan in km/h
     */
    public Sedan(String brand, String model, double price, double fuelConsumption, int maxSpeed)
            throws InvalidCarException {
        super(brand, model, price, fuelConsumption, maxSpeed);
    }
}
