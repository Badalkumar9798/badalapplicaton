public class createAndPrint {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        //Elements added
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        //print the element
        Node temp = head;
        while(temp != null){
            System.out.println(" -> "+temp.data);
            temp = temp.next;
        }
        System.out.println("Element printed Succesfully");
    }
}
