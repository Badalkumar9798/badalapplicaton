//WRITE A PROGRAM TO PRINT HOLLOW RECTANGULAR PATTERN
package nested_loop;

import java.util.Scanner;

public class hollowRectangularpattern {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the numbers of columns : ");
        int c = sc.nextInt();

        for(int i = 1;i<=r;i++){
            for(int j = 1;j<=c;j++){
                if(i==1 || i ==r||j==1||j==c){
                    System.out.print(" "+j);
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
