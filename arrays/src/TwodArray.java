import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[2][2];

        for(int i =0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print("Enter vallue -> ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Matrix is -> ");

        for(int i =0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
