
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class BlockingQueueDemo1{

    public static void main(String[] args)throws InterruptedException {
        
        BlockingQueue bq=new ArrayBlockingQueue(3);

        bq.put(10);
        bq.put(20);
        bq.put(30);

        bq.offer(40,5,TimeUnit.SECONDS);

        System.out.println(bq); // 10 20 30

        bq.take(); // remove the first element

        System.out.println(bq); // 20 30 

        // drainTo() ....convert blocking queue into array....

        ArrayList al=new ArrayList();

        System.out.println("ArrayList "+ al); //  20 30

        bq.drainTo(al);

        System.out.println(bq); // []


    }
}