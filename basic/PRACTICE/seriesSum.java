package PRACTICE;

import java.util.Scanner;

//FIND THE SUM OF THE FOLLOWING SERIES
//S=1-2+3-4.....N
public class seriesSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int result = 0;

        for(int i = 1; i<=n;i++){
            if(i%2==0){
                result -=i;
            }
            else{
                result+=i;
            }
        }
        System.out.print("the final result : " + result);
    }
}
