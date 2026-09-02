package Abstraction1;

interface A {
    void show();
}
interface B {
    void display();
}
class best implements A,B {
    public void show() {
        System.out.println("show method ");
    }

    @Override
    public void display() {
        System.out.println("Display method ");
    }
}


public class multiple_interface {
    public static void main(String[] args) {
        best t = new best();
        t.show();
        t.display();
    }
}
