import java.util.Scanner;

public class LinkedList_Input {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Enter Number of Node :- ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data :- ");
            int data = sc.nextInt();

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NUll");

        Node mid = findMiddle(head);
        System.out.println("middle Node :- "+mid.data);
    }
}
