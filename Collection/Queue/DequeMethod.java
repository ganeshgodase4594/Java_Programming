
import java.util.*;

class DequeMethodDemo{

    public static void main(String[] args) {
        
        Deque obj=new ArrayDeque();

        obj.offer(10);
        obj.offer(40);
        obj.offer(20);
        obj.offer(30);

        System.out.println(obj);

        // offerFirst // add element first position...

        obj.offerFirst(5);

        System.out.println(obj);

        // offerLast // add element Last position.....

        obj.offerLast(50);

        System.out.println(obj);

        // pollFirst

        obj.pollFirst(); // remove first element....

        System.out.println(obj);

        // pollLast()

        obj.pollLast(); // remove last element...

        System.out.println(obj);

        // peekfirst() ...// print first element..

        System.out.println(obj.peekFirst());

        // peekLast().....// print last element...

        System.out.println(obj.peekLast());

        // Iterator....

        Iterator itr=obj.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());
        }

        // descending iterator...

        Iterator itr2=obj.descendingIterator();

        while(itr2.hasNext()){

            System.out.println(itr2.next());
        }


    }
}