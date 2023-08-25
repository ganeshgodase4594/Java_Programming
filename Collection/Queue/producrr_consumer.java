
import java.util.concurrent.*;

class producer implements Runnable{

    BlockingQueue bQueue=null;

    producer(BlockingQueue bQueue){

        this.bQueue=bQueue;
    }

    public void run(){

        for(int i=1;i<=10;i++){

            try{

                bQueue.put(i);

                System.out.println("produce "+i);

            }catch(InterruptedException ie){


            }

            try{

                Thread.sleep(7000);

            }catch(InterruptedException ie){


            }
        }
    }
}

class consumer implements Runnable{

    BlockingQueue bQueue=null;

    consumer(BlockingQueue bQueue){

        this.bQueue=bQueue;
    }

    public void run(){

        for(int i=0;i<=10;i++){

            try{

                bQueue.take();

                System.out.println("Consume " + i);
            }catch(InterruptedException ie){


            }

            try{

                Thread.sleep(7000);
            }catch(InterruptedException ie){


            }
        }
    }
}

class ProducerConsumerDemo{

    public static void main(String[] args) {
        
        BlockingQueue bQueue=new ArrayBlockingQueue(3);

        producer produce=new producer(bQueue);
        consumer consume=new consumer(bQueue);

        Thread ProduceThread =new Thread(produce);
        Thread ConsumeThread=new Thread(consume);

        ProduceThread.start();
        ConsumeThread.start();
    }
}