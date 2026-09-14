import java.util.Scanner;

/** Find suffix sum array  **/

public class suffixSum {
    static int[] SuffixSum(int[] arr){

        int n = arr.length;
        int[] suffix = new int[n];

        suffix[n-1] = arr[n-1];

        for(int i=n-2;i>=0;i--){
            suffix[i] = arr[i] + suffix[i+1];
        }
        return suffix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + "elements :- ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] suffix = SuffixSum(arr);
        System.out.println    ("Suffix sum array :- ");

        for(int i =0;i<n;i++){
            System.out.print(suffix[i] + " ");
        }
    }
}
