import java.util.Arrays;
import java.util.Scanner;

public class sortzeroesAndones {
    //swap method
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortzeroesAndones(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left<right){
            if(arr[left] ==1 && arr[right]==0){
                swap(arr,left,right);

                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }

            if(arr[right] == 1){
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
        sortzeroesAndones(arr);

        System.out.println("Sorted Array : "+ Arrays.toString(arr));
    }
}
