class InsertAtMiddle {
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    Node head =null;
    //Insert at end - List create karne ke liye
    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head ==null){
            head = newNode;
            return;
        }
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //Insert after a given node
    void insertMiddle(int val,int afterval){
        Node newNode = new Node(val);
        Node temp = head;

        //AfterVal wale node ko find karo
        while(temp!=null && temp.data !=afterval){
            temp = temp.next;
        }
        //Node nahi mila
        if(temp==null){
            System.out.println("Node not found");
            return;
        }
        //Main insertion logic
        newNode.next=temp.next;
        temp.next = newNode;

    }
    //Display linked list
    void display(){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertAtMiddle list = new InsertAtMiddle();
        //Create linked list
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Before insertion:- ");
        list.display();

        //20 ke baad 25 insert
        list.insertMiddle(25,20);

        System.out.println("After insertion :");
        list.display();
    }
}
