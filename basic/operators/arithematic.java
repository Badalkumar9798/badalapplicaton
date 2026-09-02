package operators;

import java.util.Scanner;

public class arithematic {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number  : ");
        int num_1 = input.nextInt();

        System.out.print("Enter second number : ");
        int num_2 = input.nextInt();

//        Addition
        int sum = num_1+num_2;
//        Subtraction
        int sub = num_1-num_2;
//      Multiplication
        float multi = num_1*num_2;
//        Division
        float divi = num_1/num_2;
//        Modulus
        float mod = num_1%num_2;

        System.out.println("BASIC.sum = "+sum);
        System.out.println("subtraction  ="+sub);
        System.out.println("multiplication ="+multi);
        System.out.println("division = "+divi);
        System.out.println("modulus = "+mod);
    }
}
