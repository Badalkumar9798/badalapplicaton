//calculate the sum of all the elements in the given array
public class sum {
    void SumOfArray(){
        int arr[] = {1,2,5,6,3,5,3};
        int sum =0;

        for (int i=0;i<arr.length;i++){
            sum = sum+ arr[i];
        }
        System.out.println("Sum of array -> "+sum);

    }
    public static void main(String[] args) {
        sum obj = new sum();
        obj.SumOfArray();
    }
}
