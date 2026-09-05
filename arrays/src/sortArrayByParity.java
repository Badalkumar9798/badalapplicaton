import java.util.Arrays;
import java.util.Scanner;

public class sortArrayByParity {
    //swap method
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortArrayByParity(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left<right){
            if(arr[left] %2==1 && arr[right]%2 ==0){
                swap(arr,left,right);

                left++;
                right--;
            }
            if(arr[left]%2 ==0){
                left++;
            }

            if(arr[right] %2 == 1){
                right--;
            }
        }
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
        sortArrayByParity(arr);

        System.out.println("Sorted Array : "+ Arrays.toString(arr));
    }
}
