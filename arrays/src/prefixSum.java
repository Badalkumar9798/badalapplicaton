import java.util.Scanner;

public class prefixSum {
    static void printArray(int[] arr) {
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for(int i = 1;i<n;i++){
            pref[i] = pref[i-1] + arr[i];

        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter "+ n+ " elements :- ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Input Array :- ");
        printArray(arr);

        System.out.print("Output Array :- ");
        int[] pref = makePrefixSumArray(arr);
        printArray(pref);

    }
}
