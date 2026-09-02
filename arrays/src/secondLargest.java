import java.util.Scanner;

//find second_largest element form the array
public class secondLargest {
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] >mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findsecondMax(int[] arr){
        int mx = findMax(arr);

        for(int i =0;i<arr.length;i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);
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
        System.out.println("Second Minimum element : " + findsecondMax(arr));

    }
}
