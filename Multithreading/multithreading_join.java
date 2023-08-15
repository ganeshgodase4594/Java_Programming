
// join method

class mythread1 extends Thread{

    public void run(){

        for(int i=0;i<10;i++){

            System.out.println("Thread-0");
        }
    }
}

class ThreadDemo3{

    public static void main(String[] args) {
        
        mythread1 obj1=new mythread1();

        obj1.start();

        try {
            obj1.join();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }

        for(int i=0;i<10;i++){

            System.out.println("main");
        }
    }
}