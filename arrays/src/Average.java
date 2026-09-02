import java.util.Scanner;

public class Average {
    static double getAverage(int[] arr){
        double sum =0;
        for(int i :arr){
            sum +=i;
        }
        int size = arr.length;
        double Avg = sum/size;
        return Avg;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        //printing array
        System.out.println("Array elements are -> ");

        for(int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
        //calculate and print average
        System.out.println("The average is -> "+getAverage(arr));

    }

}
