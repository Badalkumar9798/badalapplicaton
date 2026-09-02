import java.util.Scanner;

public class check_repeating_No {
    //function to count occurrences
    static int countOccurences(int[] arr, int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input the size
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();

        //input the array element
        int [] arr = new int[n];
        System.out.print("Enter " + n + " element ");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //input x
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        int result = countOccurences(arr,x);

        if(result>0){
            System.out.println("count of x : "+result);
        }
        else{
            System.out.println("Element not found ");
        }

    }
}
