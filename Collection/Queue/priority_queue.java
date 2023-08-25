
import java.util.*;

class priority_queue_demo{

    public static void main(String[] args) {
        
        PriorityQueue q= new PriorityQueue(); // internally called heap data structure,,,

        q.offer(20);
        q.offer(10);
        q.offer(50);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        q.offer("ganesh");
        q.offer("godase");
        q.offer("vishal");
        q.offer("dhiraj");
        q.offer("aniket");

        System.out.println(q);
    }
}