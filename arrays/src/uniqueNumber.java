/* Find the unique number in a given array where all
the element are being repeated twice with one value being unique */

import java.util.Scanner;

public class uniqueNumber {
    static int uniqueElement(int[] arr ){
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans =-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                 ans =arr[i];
            }
        }
        return ans;
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
        System.out.println("Unique Element : " + uniqueElement(arr));

    }
}
