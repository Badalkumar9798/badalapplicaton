//count the number of elements strictly greater than value x
import java.util.Scanner;

public class StrictlyGreater {
    static void strictlygreaterNumber(int [] arr,int x){
        int greater = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                System.out.println(arr[i]);
                greater++;
            }
        }
        System.out.print("total number greater than " + x+ " = "+greater);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input the size
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();

        //input the array element
        int [] arr = new int[n];
        System.out.print("Enter " + n + " element : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //input x
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        strictlygreaterNumber(arr,x);



    }
}
