import java.util.Scanner;

/* count the number of triplets whose sum is equal to the given value */
public class tripletsSum {
    static int tripletSum(int[] arr,int target){
        int ans = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.println(arr[i] +" , " +arr[j] +" , "+ arr[k] );
                        ans++;

                    }
                }
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
        System.out.print("Enter the target sum : ");
        int target = sc.nextInt();

        System.out.println("Elements : ");
        int totaltriplet = tripletSum(arr, target);
        System.out.println("total triplet  = " + totaltriplet);
    }
}
