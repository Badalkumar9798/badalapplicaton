package PRACTICE;

import java.util.Scanner;

//give 2  numbers a and b . find a raised to the power b.
public class power {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();

        int result = 1;
        for(int i = 1;i<=b;i++){
            result *=a;
        }
        System.out.print("The power is : "+ result);


    }
}
