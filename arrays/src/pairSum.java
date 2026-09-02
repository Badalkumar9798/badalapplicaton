import java.util.Scanner;

/*find the total number of pairs  in the array whose sum
is equal to the given value x */
public class pairSum {
    static int pairSum(int [] arr,int target){
        int n = arr.length;
        int ans =0;

        for(int i =0;i<n;i++){ //first number
            for(int j =i+1;j<n;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " , " + arr[j]);
                    ans++;
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
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum : ");
        int target = sc.nextInt();

        System.out.print("Element ");
        int totalPairs = pairSum(arr,target);
        System.out.println("total pairs = " + totalPairs);
    }

}

