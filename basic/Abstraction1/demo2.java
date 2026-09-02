package Abstraction1;

public class demo2 {
    public static void main(String[] args) {
        car car = new fuelcar();
        car.start();
        car.accelerate();
        car.brake();

    }
}

interface car {
    void start();
    void accelerate();
    void brake();
}
class fuelcar implements car {
    @Override
    public void start (){
        System.out.println("fuel Abstraction1.car is started");
    }
    @Override
    public void accelerate(){
        System.out.println("fuel Abstraction1.car is accelerating ");
    }
    @Override
   public void brake(){
        System.out.println("fuel Abstraction1.car is stoped");
    }
}
class electriccar implements car {
    @Override
    public void start(){
        System.out.println("Electric Abstraction1.car is started");
    }
    @Override
   public void accelerate(){
        System.out.println("Electric Abstraction1.car is accelerating ");
    }
    @Override
   public void brake(){
        System.out.println("Electric Abstraction1.car is stoped");
    }
}