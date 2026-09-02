package BASIC;

import java.util.Scanner;

public class subtract {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num_1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int num_2 = sc.nextInt();

        int subtract = num_1 - num_2;
        System.out.println("the subtraction is : " + subtract);
    }
}
