//WRITE A PROGRAM TO PRINT PRYMID SHAPE PATTERN
package nested_loop;

import java.util.Scanner;

public class pyramid_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows  : ");
        int r = sc.nextInt();

        for(int i=1;i<=r;i++){//traversing over the rows
            //print r-i spaces
            for(int j = 1;j<=r-i;j++){
                System.out.print("  ");
            }
            //print 2*i-1
            for(int k =1;k<=2*i-1;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
