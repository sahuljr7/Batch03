package assignment;

// Base class
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass of Vehicle
class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car"); // Overridden method
    }
}

// Main class
public class Program2 {

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.drive(); // Output: Driving a vehicle

        Car myCar = new Car();
        myCar.drive();     // Output: Repairing a car
    }
}
