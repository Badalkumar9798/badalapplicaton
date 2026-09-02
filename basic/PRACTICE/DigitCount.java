//Count the number of digit for a given number n
package PRACTICE;

import java.util.Scanner;

public class DigitCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int numOfDigit = 0;
        int original_n = n;


        while(n>0){
            n=n/10;
            numOfDigit++;
        }
        System.out.println("Number of Digit in : " + " = " + numOfDigit);

    }


}
