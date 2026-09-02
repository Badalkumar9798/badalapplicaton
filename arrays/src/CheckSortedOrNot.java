import java.util.Scanner;

public class CheckSortedOrNot {

    static boolean isSorted(int[] arr){
        boolean check = true;

        for(int i =1;i< arr.length;i++){
            if(arr[i-1] > arr[i]){
                //not sorted
                check = false;
                break;

            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input the size
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();

        //input the array element
        int[] arr = new int[n];
        System.out.print("Enter " + n + " element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Is Sorted : "+ isSorted(arr));

    }
}
