package BASIC;

import java.util.Scanner;
public class input {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lucky number :");
        int num_1 = input.nextInt();

        System.out.println("your lucky number is :" + num_1);

        System.out.print("Enter your name : ");
        String name = input.next();

        System.out.println("your name is :"+name);

    }
}
