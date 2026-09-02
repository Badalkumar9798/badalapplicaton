//calculate the maximum value out of all the elements in the array
public class maxNumber {
    void maxOfArray() {
        int arr[] = {1,2,3,5,8,6}; //ans -> 8

        int ans = 0;

        for (int i = 0;i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println("Maximum number -> "+ans);
    }
    public static void main(String[] args) {
        maxNumber obj = new maxNumber();
        obj.maxOfArray();
    }
}
