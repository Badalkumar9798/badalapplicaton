//Count the number of Zeroes and Ones
public class count0sAnd1s {
    static int[] getcount(int arr[]){
        int CountOne = 0;
        int CountZero = 0;

        for(int i =0;i< arr.length;i++){
            if(arr[i]==1){
                //agar pura array mai 1 dekh gya to
                CountOne++;

            }
            else{
                //agar 0 dekh gya to
                CountZero++;
            }
        }
        int ans[] = {CountOne,CountZero};
        return ans;

    }
    static void main() {
        int arr[] = {1,1,0,1,0,1,0,0,1,0,1};
        int ans[] = getcount(arr);
        System.out.println("Ones Count -> "+ans[0]);
        System.out.println("Zeroes Count -> "+ans[1]);
    }
}
