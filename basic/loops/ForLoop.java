package loops;
//BASIC.print n number by using for loop

import java.util.Scanner;

public class ForLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int n = sc.nextInt();

        for(int num = 1;num<=n;num++){
            System.out.println(num);
        }
    }
}
