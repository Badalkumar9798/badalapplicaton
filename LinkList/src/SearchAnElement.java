public class SearchAnElement {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        //Linked List create karna
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        //jis element ko search karna hai
        int x = 30;
        //position 1 se start hogi
        int position =1;

        //Initially element nahi mila
        boolean found =false;

        //head se traversal start
        Node temp =head;
        while(temp!=null){
            //current node ka data x ka equal hai
            if(temp.data ==x){
                //element mil gaya
                found = true;

                //loop stop
                break;
            }
            //Next node par mpve karna
            temp = temp.next;

            //position increase karna
            position++;
        }
        //result check karna
        if(found){
            System.out.println("Element found at position "+position);

        }else{
            System.out.println("Element not found");
        }
    }
}
