
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class BlockingQueueDemo{

    public static void main(String[] args)throws InterruptedException {
        
        BlockingQueue bq=new ArrayBlockingQueue(3);

        bq.offer(10);
        bq.offer(20);
        bq.offer(30);

        System.out.println(bq); // 10 20 30

        bq.put(40); // block the thread...

        System.out.println(bq); // no output...

    }
}