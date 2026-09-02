package PRACTICE;

import java.util.Scanner;

public class sumDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int SumDigit = 0;
        int original = n;

        while(n>0){
            SumDigit +=n%10;
            n = n/10;
        }
        System.out.println("sum of digit : "+ " = " + SumDigit);
    }
}
