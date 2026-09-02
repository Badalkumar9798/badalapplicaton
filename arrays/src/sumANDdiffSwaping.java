//swaping the value by using sum and difference method

public class sumANDdiffSwaping {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        System.out.println("Value before swaping :- ");
        System.out.println("a = " + a);
        System.out.println("b = "+ b);

        a = a+b;
        b=a-b;
        a = a-b;

        System.out.println("Value after swaping :- ");
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
    }
}
