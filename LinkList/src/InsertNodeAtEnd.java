public class InsertNodeAtEnd {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){

        //Existing Linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        //New node create karna
        Node newNode = new Node(40);

        //head se traversal start karna
        Node temp = head;

        //Last Node tak jaana
        while(temp.next !=null){
            temp = temp.next;
        }

        //last node ko new node se connect karna
        temp.next = newNode;

        //display ke liye temp ko dobara head per lana
        temp = head;

        while(temp!=null){
            System.out.println(temp.data+ " -> ");
            //Next node par move karna
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
