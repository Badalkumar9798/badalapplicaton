import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //Array Size
        System.out.print("Enter the size :- ");
        int size = s.nextInt();

        int [] arr = new int[size];

        //Array elements
        System.out.print("Enter array elements :- ");
        for(int i =0;i< size;i++){
            arr[i] = s.nextInt();
        }
        //Rotation time
        System.out.print("Enter rotation times ");
        int n = s.nextInt();

        //Rotate n times
        for(int k =0 ;k<n;k++){
            int last = arr[size -1];

            for (int i =size -1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;

        }
        //print rotated array

        System.out.println("Array after rotaion:- ");
        for(int i =0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}
