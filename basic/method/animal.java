package method;

import java.sql.SQLOutput;

public class animal {

    public void eat() {
        System.out.println("I am eating");
    }

    public void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        System.out.println("1");

        animal buzo = new animal();
        buzo.eat();
        buzo.run();

        animal obj= new animal();
        birds sp = obj.new birds();
        sp.fly();
    }
    class birds{

        public void fly(){
            System.out.println("I am flying ");

        }



    }
}