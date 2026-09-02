package BASIC;

import java.util.Scanner;

public class simple_interest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle amount : ");
        float p = sc.nextFloat();

        System.out.print("Enter Rate of interest : ");
        float r = sc.nextFloat();

        System.out.print("Enter time : ");
        float t = sc.nextFloat();

        float i = (p*r*t)/100;

        System.out.print("your total interest is : " + i);

    }
}
