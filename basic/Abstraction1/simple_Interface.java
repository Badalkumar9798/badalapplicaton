package Abstraction1;

interface Animal {
    void sound ();
}
class dog implements Animal {
    public void sound (){
        System.out.println("Abstraction1.dog barks ");
    }
}
class cat implements Animal {
    public void sound () {
        System.out.println("Abstraction1.cat meow");
    }
}

public class simple_Interface {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();

        cat c = new cat();
        c.sound();
    }
}
