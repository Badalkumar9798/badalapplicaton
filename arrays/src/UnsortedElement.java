public class UnsortedElement {
    static int SearchElement (int arr[]){

        for(int i =0;i<arr.length;i++){
            if(arr[i+1]<=arr[i]){
                //toh sab thik hai
                //kuch karne ki need nahi hai
                return arr[i+1];
            }
        }
        return -1;
    }
    static void main() {
        int arr[] = {1,6,5,4,9};
        System.out.println(SearchElement(arr));
    }
}
