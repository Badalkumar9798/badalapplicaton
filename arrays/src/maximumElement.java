public class maximumElement {
    static int getmaximum(int arr[]){
        int max =arr[0];

        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]); //this function used to return thr largest
            //value between two number
            //by using condition
//            if(arr[i] > maxi){
//                maxi = arr[i];
//            }

        }

        //jab mai yaha pahuchunga toh pura array compare ho chuka hoga
        //and maxi k andar sabsi badi value hogi
        return max;
    }
    static void main() {
        int arr[] = {1, 4, 2, 5, 3, 7};
        System.out.println(getmaximum(arr));

    }
}
