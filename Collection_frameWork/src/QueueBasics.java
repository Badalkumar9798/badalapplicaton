import java.util.LinkedList;
import java.util.Queue;
public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);

        //remove element by using poll
        System.out.println("Removing :- "+q.poll());
        System.out.println(q);
        //Access the first element by using peek
        System.out.println("Access the first element :- "+ q.peek());



    }
}
