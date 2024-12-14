package Lab6;

import Lab5.modules.*;
import java.util.List;
import java.util.Arrays;
import Lab6.modules.MyCollectionImplementation;


public class MainProgram {
    /**
     * {@link}
     * https://docs.google.com/document/d/1y9EnSWRg70sJh5CBO0N1lmcxFM7SVax2bvfagcH1c2I/edit?tab=t.0#heading=h.1tj95ple0sjo
     *
     * {@summary}
     * StudentId - КВ13879017
     * C2 = 1: (Set)
     * C0 = 0: Масив із початковою кількістю елементів 15 та збільшенням кількості елементів на 30%
     *
     * Створити клас, що описує типізовану колекцію
     * (типом колекції є узагальнений клас з лабораторної роботи №5),
     * що реалізує заданий варіантом інтерфейс (п.2) та має задану внутрішню структуру (п.3).
     *
     * Реалізувати всі методи інтерфейсу,
     * а також створити не менше ніж 3 конструктори
     * (
     * 1 – порожній,
     * 2 – в який передається 1 об’єкт узагальненого класу,
     * 3 – в який передається стандартна колекція об’єктів
     * ).
     * Всі початкові дані задаються у виконавчому методі.
     * Код повинен бути детально
     * задокументований. Код повинен відповідати стандартам Java Code Conventions (або Google Java
     * Style Guide) та бути завантаженим на GitHub.
     *
     */
    public static void main(String[] args) {

        try {
            Car sedan = new Sedan("Toyota", "Camry", 24000, 7.5, 210);

            // Adding 1 general object using a constructor with 1 gneral object
            MyCollectionImplementation<Car> carCollection =
                    new MyCollectionImplementation<Car>(sedan);

            // Creating a collection using a constructor which acccepts collection object
            MyCollectionImplementation<Car> carCollectionFromList =
                    new MyCollectionImplementation<Car>(
                            Arrays.asList(
                                    new SUV("Ford", "Explorer", 32000, 10.0, 200),
                                    new Truck("Volvo", "VNL", 50000, 15.0, 180)));


            System.out.println("Size of carCollection: " + carCollection.size());
            System.out.println("Size of carCollectionFromList: " + carCollectionFromList.size());

            System.out.println("Contains Toyota Camry: " + carCollection.contains(sedan));

            carCollection.remove(sedan);
            System.out.println("Size after removal: " + carCollection.size());

            carCollectionFromList.clear();
            System.out.println("Size after clearing: " + carCollectionFromList.size());
        } catch (Exception e) {

            System.err.println("Error: " + e.getMessage());
        }
    }

}
