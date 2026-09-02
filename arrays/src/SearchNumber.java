//Search the given element x in the array . if present then return the index
//else return -1...
public class SearchNumber {
    void SearchTheNumber() {
        int arr[] ={2,5,6,8,5,9,4,2};
         int find = 9;
         int ans = -1;

         for(int i =0;i<arr.length;i++){
             if(arr[i]==find){
                 ans =i;
                 break;
             }
         }
        System.out.println("The number -> "+find +" at index "+ans);
    }
    public static void main(String[] args) {
        SearchNumber obj = new SearchNumber();
        obj.SearchTheNumber();
    }
}
