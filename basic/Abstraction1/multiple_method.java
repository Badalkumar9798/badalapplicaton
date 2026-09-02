package Abstraction1;

interface Calculator {
    void add (int a , int b);
    void sub(int a , int b);
}

class mycalc implements Calculator {
    public void add ( int a,int b) {
        System.out.println("Sum = " + (a+b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("sub = " + (a-b));
    }
}

public class multiple_method {
    public static void main(String[] args) {
        mycalc c = new mycalc();
        c.add(10,45);
        c.sub(45,5);
    }
}
