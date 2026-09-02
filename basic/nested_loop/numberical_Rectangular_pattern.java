//WRITE A PROGRAM TO PRINT Numberical Rectangular pattern
package nested_loop;

import java.util.Scanner;

public class numberical_Rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to : ");
        int r = sc.nextInt();

        for(int i= 1; i<=r;i++){
            for(int j=i ;j<=r;j++){
                System.out.print(j);
            }
            for(int k =1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

}
