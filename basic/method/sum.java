package method;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();

        System.out.print("Sum of input numbers is :");
        int ans = obj.add(a, b);
        System.out.println(ans);
    }
}
class Algebra{
        public int add(int x,int y){
            return x+y;
        }

}

