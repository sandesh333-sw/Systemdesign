
/**
 * Abstraction:
 * Hiding complex internal implementation details
 * and exposing only essential functionality.
 */

// Abstract class
abstract class Vehicle {

    // Abstract method (no implementation)
    abstract void start();

    // Concrete method (has implementation)
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Concrete class
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts using a key.");
    }
}

// Another concrete class
class ElectricCar extends Vehicle {

    @Override
    void start() {
        System.out.println("Electric car starts using a button.");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle tesla = new ElectricCar();
        tesla.start();
        tesla.stop();
    }
}
