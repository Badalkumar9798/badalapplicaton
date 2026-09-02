//WRITE A PROGRAM TO PRINT TRIANGULAR PATTERN
package nested_loop;

import java.util.Scanner;

public class Triangular_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :  ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();

        for(int i = 1; i<=r;i++ ){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
