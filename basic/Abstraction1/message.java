package Abstraction1;

interface demoa {
    default void msg() {
        System.out.println("Hello from default method");
    }
}
class test implements demoa {}

class main {
    public static void main(String[] args) {
        test t = new test();
        t.msg();
    }
}
