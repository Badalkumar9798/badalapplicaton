package Inheritance;

class animal {
    void eat(){
        System.out.println("I am eating ");
    }
    void sleep(){
        System.out.println("I am sleeping ");
    }
    void run(){
        System.out.println("I am running ");
    }
}
class dog extends animal{

}
class cat extends animal{

}
public class test{
    public static void main(String[] args) {

        animal d = new dog();
        System.out.println("------Dog output------");
        d.eat();
        d.sleep();
        d.run();

        animal c  = new cat();
        System.out.println("------Cat Output------");
        c.run();
        c.eat();
        c.sleep();
    }
}

