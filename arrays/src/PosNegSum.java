public class PosNegSum {
    static int[] postiveORnegative(int[] arr){
        int positiveSum = 0;
        int negativeSum = 0;

        for(int i =0;i< arr.length;i++){
            if(arr[i]>0){
                // number is positive
                positiveSum = positiveSum+arr[i];
            }
            else{
                //number is negative
                negativeSum = negativeSum+arr[i];
            }
        }
        int ans[] = {positiveSum,negativeSum};
        return ans;
    }
    static void main (){
        int arr[]= {1,-3,5,-7,5,-2,8};
        int ans[] = postiveORnegative(arr);
        System.out.println("Positive PosNegSum = "+ans[0]);
        System.out.println("Negative PosNegSum = "+ans[1]);


    }
}
