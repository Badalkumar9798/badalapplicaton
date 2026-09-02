package Abstraction1;

abstract class Car {
    void start() {
        System.out.println("Abstraction1.Car started");
    }

    abstract void accelerate();
    abstract void brake();
}

// Fuel Abstraction1.Car
class FuelCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Fuel Abstraction1.car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel Abstraction1.car is stopping");
    }
}

// Electric Abstraction1.Car
class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric Abstraction1.car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electric Abstraction1.car is stopping");
    }
}

class Vehicle {
    public static void main(String[] args) {

        Car car1 = new FuelCar();
        car1.start();
        car1.accelerate();
        car1.brake();

        System.out.println();

        Car car2 = new ElectricCar();
        car2.start();
        car2.accelerate();
        car2.brake();
    }
}