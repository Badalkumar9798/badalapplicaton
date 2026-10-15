// Insert at any position of Linked List

public class insert_at_any_place {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertAtAnyPosition1(Node head, int pos, int val) {

        Node newNode = new Node(val);

        // Insert at beginning
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node temp = head;

        // Reach node at position pos-1
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Invalid Position");
            return head;
        }

        // Insert new node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Print Linked List
    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create Linked List
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before insertion:");
        printList(head);

        // Insert 25 at position 2
        head = insertAtAnyPosition1(head, 2, 25);

        System.out.println("After insertion:");
        printList(head);
    }
}