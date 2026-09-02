package BASIC;

import java.util.Scanner;

public class findChar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(5);
        System.out.println("your character is : " + ch);
    }

}
