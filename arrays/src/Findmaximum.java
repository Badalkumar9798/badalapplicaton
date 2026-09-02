import java.util.Scanner;

public class Findmaximum {
    static int findmaximum(int[] arr){
        int mx = Integer.MIN_VALUE;

        for(int i =0;i< arr.length;i++){
            if(arr[i] >mx){
                mx = arr[i];
            }
        }
        return  mx;
    }
    static int findSecondMax(int [] arr){
        int mx = findmaximum(arr);
        int n = arr.length;

        for(int i =0;i<n;i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findmaximum(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Second maximum Element " + findSecondMax(arr));
    }
}
