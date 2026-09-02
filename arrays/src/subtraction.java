//subtract the array
public class subtraction {
    void SubOfArray(){
        int arr[] ={1,2,3,4,5,6};
        int sub=arr[0];

        for(int i=0;i< arr.length;i++){
            sub = sub-arr[i];
        }
        System.out.println("The Subtraction ->"+sub);
    }
    public static void main(String[] args) {
        subtraction obj = new subtraction();
        obj.SubOfArray();
    }


}
