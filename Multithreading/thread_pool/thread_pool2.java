import java.util.concurrent.*;

class Mythread implements Runnable {
    int num;

    Mythread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(Thread.currentThread() + " start Thread " + num);

        dailyTask();

        System.out.println(Thread.currentThread() + " end Thread " + num);
    }

    void dailyTask() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException obj) {
            // Exception handling
        }
    }
}

class Thread_Pool {
    public static void main(String[] args) {
        ExecutorService ser = Executors.newCachedThreadPool();

        for (int i = 0; i < 6; i++) {
            Mythread obj = new Mythread(i);
            ser.execute(obj);
        }

        ser.shutdown();
    }
}

