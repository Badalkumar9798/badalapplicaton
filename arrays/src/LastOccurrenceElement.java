//find the last occurrence of an element x in the given array
import java.util.Scanner;

public class LastOccurrenceElement {
    static int countlastOccurence(int [] arr,int x){
        int lastindex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastindex = i;
            }
        }
        return lastindex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input size of array
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        //input the Array element
        int arr[] = new int[n];
        System.out.print("Enter " + n +" element : ");
        for(int i=0 ;i < arr.length;i++){
            arr[i]= sc.nextInt();
        }
        //input x
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        System.out.print("Last Occurrence of x "+ countlastOccurence(arr,x));
    }
}
