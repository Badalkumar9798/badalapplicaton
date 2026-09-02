//WRITE A PROGRAM TO PRINT INVERTED TRIANGLE
package nested_loop;

import java.util.Scanner;

public class Inverted_triangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();

        for(int i = 1;i<=r;i++){
            for(int j = 1; j<=(r+1-i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
