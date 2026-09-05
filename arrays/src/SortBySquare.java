import java.util.Arrays;
import java.util.Scanner;

public class SortBySquare {
    //swap method
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int[] sortbySquare(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];
        int k = n-1;

        while(left<=right){
           if(Math.abs(arr[left]) > Math.abs(arr[right])){
               ans[k] = arr[left] * arr[left];
               left++;
           }else {
               ans[k] = arr[right] * arr[right];
               right--;
           }
           k--;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array size
        System.out.print("Enter array size :- ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        //array element
        System.out.print("Enter array element :- ");
        for(int i = 0;i < n;i++){
            arr[i]= sc.nextInt();
        }
        int[] ans = sortbySquare(arr);

        System.out.println("Sorted Square Array : "+ Arrays.toString(ans));
    }
}
