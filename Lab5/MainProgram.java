package Lab5;

import Lab5.modules.*;
import java.util.List;


public class MainProgram {
    /**
     * {@link}
     * https://docs.google.com/document/d/1r1RhKq2mYwugMr-9FdNiO1Q33UkSzCGTkMJ4L7LrcOo/edit?tab=t.0#heading=h.1tj95ple0sjo
     *
     * {@summary}
     * StudentId - КВ13879017 C13 = 9
     *
     * Визначити ієрархію легкових автомобілів.
     * Створити таксопарк. Порахувати вартість автопарку.
     * Провести сортування автомобілів парку за витратами палива.
     * Знайти автомобіль у компанії,
     * що відповідає заданому діапазону швидкості автомобіля.
     *
     */
    public static void main(String[] args) {
        TaxiPark park = new TaxiPark();

        try {
            park.addCar(new Sedan("Toyota", "Camry", 24000, 7.5, 210));
            park.addCar(new SUV("Ford", "Explorer", 32000, 10.0, 200));
            park.addCar(new Truck("Volvo", "VNL", 50000, 15.0, 180));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Total value of taxi park: " + park.calculateTotalValue());

        park.sortCarsByFuelConsumption();
        System.out.println("Cars sorted by fuel consumption:\n" + park);

        List<Car> fastCars = park.findCarsBySpeedRange(190, 220);
        System.out.println("Cars with speed in range 190-220 km/h:");
        for (Car car : fastCars) {
            System.out.println(car);
        }
    }

}
