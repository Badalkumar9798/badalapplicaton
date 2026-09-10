import java.util.Scanner;

/**Given an array of integers of size n . Answer q queries where you need to print
 * the sum of values in a given range of indices from 1 or r (both included).
 * NOTE :- The values of l and r in queries follow 1 - based indexing **/

public class prefixSum2 {
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i =0;i<arr.length;i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){

        int totalSum = findArraySum(arr);
         int prefSum = 0;

         for(int i =0;i<arr.length-1;i++){
             prefSum += arr[i];
             int suffixSum = totalSum -prefSum;
             if(suffixSum == prefSum){
                 return true;
             }
         }
         return false;
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
        System.out.println("Equal Partition possible :- " + equalSumPartition(arr));
    }
}
