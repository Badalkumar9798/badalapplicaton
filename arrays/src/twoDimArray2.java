import java.util.Scanner;

//By taking input by the user and print the Array
public class twoDimArray2 {
    static void printArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
                // System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of Rows :- ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns :- ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c]; // total elements = r*c

        System.out.println("Enter "+ r*c +" Elements ");
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}
