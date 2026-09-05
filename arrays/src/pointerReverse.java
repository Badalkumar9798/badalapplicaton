//Reverse an aray by using two pointer

public class pointerReverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        int i = 0;
        int j= arr.length-1;

        System.out.print(" Before Swaping :- ");
        for(int p =0 ;p<arr.length;p++){
            System.out.print(arr[p]+ " ");

        while (i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j]= temp;

            i++;
            j--;
        }

        }
        System.out.print("After Swaping :- ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }


    }
}
