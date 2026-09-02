package IfElseStatement;

import java.util.Scanner;

public class AgeGroup {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age :");
        int age = sc.nextInt();

        if(age<=12){
            System.out.print("This is child");
        }
        else if (age >12 && age <=18){
            System.out.print("this is Teenager");
        }
        else {
            System.out.println("this are Adult ");
        }
    }
}
