import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Size input
        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Array input
        System.out.print("Enter Array element :- ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //Target input
        System.out.print("Enter element to search :- ");
        int target = sc.nextInt();
        boolean found = false;

        //Searching element
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at  index -> "+ i);

                found = true;

                break;
            }
        }
        if(found == false){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
