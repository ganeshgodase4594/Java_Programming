import java.util.LinkedList;
import java.util.Queue;

class QueueDemo{

    public static void main(String[] args) {
        
        Queue q=new LinkedList();

        q.offer(10);
        q.offer(20);
        q.offer(50);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        q.poll();  // remove first element....

        System.out.println(q);

        q.remove();

        System.out.println(q);

        System.out.println(q.peek()); // top element...

        System.out.println(q.element()); // top element...

        q.remove();
        System.out.println(q);

        q.remove();
        q.remove();

        System.out.println(q);

       // q.remove();  //...whwn queue is empty and we call remove method then exception

        q.poll();  // but we use poll method on empty queue then no exception...
    }
}