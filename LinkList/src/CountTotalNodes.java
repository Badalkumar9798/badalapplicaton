public class CountTotalNodes {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static void main(String[] args){
        //Linked List create karna
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        //Initially count zero hai
        int count =0;
        //head se traversal start karna
        Node temp = head;
        //jab tak node null nahi hota
        while(temp !=null){
            count++;
            temp = temp.next;
        }
        System.out.println("Total Nodes: "+count);
    }
}
