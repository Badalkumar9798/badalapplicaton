import java.util.Arrays;
import java.util.Scanner;

//find smallest and largest element for the array
public class smallestAndLargest {
    static int [] smallestAndlargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0] , arr[arr.length - 1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input the size
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();

        //input the array element
        int[] arr = new int[n];
        System.out.print("Enter " + n + " element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = smallestAndlargestElement(arr);
        System.out.println("Smallest element -> " +ans[0]);
        System.out.println("Largest element -> " + ans[1]);
    }
}
