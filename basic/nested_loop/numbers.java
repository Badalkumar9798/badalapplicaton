package nested_loop;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of coloums : ");
        int c = sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
