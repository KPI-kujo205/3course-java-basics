package Lab5.modules;

/**
 * Represents an SUV (Sport Utility Vehicle), a car type known for its higher ground clearance and
 * spacious interior.
 */
public class SUV extends Car {
    /**
     * Constructs a new SUV with specified attributes.
     *
     * @param brand the brand of the SUV
     * @param model the model of the SUV
     * @param price the price of the SUV in dollars
     * @param fuelConsumption the fuel consumption of the SUV in liters per 100 km
     * @param maxSpeed the maximum speed of the SUV in km/h
     */
    public SUV(String brand, String model, double price, double fuelConsumption, int maxSpeed)
            throws InvalidCarException {
        super(brand, model, price, fuelConsumption, maxSpeed);
    }
}
