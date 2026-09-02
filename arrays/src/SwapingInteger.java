//given 2 integers A and B .
// Swap the 2 given values using temporary vari


public class SwapingInteger {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;

        System.out.println("Before Swaping :- ");
        System.out.println("a = " + a );
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b= temp;

        System.out.println("value After swaping :- ");
        System.out.println("a = " +a);
        System.out.println("b = " +b);


    }
}
