import java.util.Scanner;

public class rotateArray2 {
    //Array ko reverse kare ge
    static void reverse(int[] arr, int start , int end ){
        while(start <end){
            int temp = arr[start];
            arr [start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    //Array ko right rotate kare ge by k position
    static void rotate(int[]arr, int k){
        int n = arr.length;
        k=k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
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
        //k input
        System.out.print("Enter rotation time :- ");
        int k = sc.nextInt();

        //rotate
        rotate(arr,k);

        //result print
        System.out.println("Rotated array ");
        for(int i = 0 ; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}
