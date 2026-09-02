package PRACTICE;

import java.util.Scanner;

//REVERSED THE NUMBER
public class reversedNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int result = 0;
         while(n>0){
             result = result * 10 + n%10;
             n/=10;
         }
        System.out.print("Reversed Result" + result);
    }

}
