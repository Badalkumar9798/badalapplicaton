import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
public class ArraydequeBasics {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(11);
        q.offer(12);
        q.offer(14);
        System.out.println("Element in the queue :- "+ q);
        //Add  element in 0th index
        q.offerFirst(5);
        //Add element in last index
        q.offerLast(15);
        System.out.println("Add and Remove element from first and last :- "+q);
        //remove element from last
        q.pollLast();
        System.out.println("remove element from last :- "+q);
        //remove element from first
        q.pollFirst();
        System.out.println("remove first element :-  "+q);
        //view the top element by using peek
        System.out.println("show the first element :-"+ q.peek());
        System.out.println("show the element :- "+q.peekFirst());
        System.out.println("show the last element :- "+q.peekLast());

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Original stack :- "+ stack);

        stack.pop();
        System.out.println("remove from top element :- "+stack);
        System.out.println("show the first element :- "+stack.peek());

        //PRIORITYQUEUE
        //default behaviour -> Integer ->less value -> high priority
         Queue<Integer> pq = new PriorityQueue<>();
         pq.offer(10);
         pq.offer(20);
         pq.offer(30);
         pq.offer(5);

        System.out.println("Original PriorityQueue :- "+pq);
        System.out.println("when poll the element :- "+pq.poll());
        System.out.println(pq);

        //Creating maxheap -> Integer ->high value -> high priority
        Queue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a);
        pq2.offer(17);
        pq2.offer(15);
        pq2.offer(20);
        pq2.offer(30);

        System.out.println("original PriorityQueue2 :- "+pq2);
        System.out.println("when poll the element :- "+pq2.poll());



    }
}
