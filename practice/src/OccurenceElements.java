import java.util.Scanner;

public class OccurenceElements {
    static int countOccurence(int[]arr,int x ){
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array :- ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter n ");
        int x = sc.nextInt();
        int result=countOccurence(arr,x);
        if(result>0){
            System.out.println("count of x "+x+" is "+result);

        }else{
            System.out.println("Element not found");
        }

    }
}