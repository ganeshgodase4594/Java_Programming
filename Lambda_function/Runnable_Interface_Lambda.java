
// Runnable Interface with lambda Function...

class ThreadDemo{

    public static void main(String[] args) {
        
        Runnable obj= () -> {
            
            // public void run(){

            //     System.out.println(Thread.currentThread().getName());
            // }

            System.out.println(Thread.currentThread().getName());

            
        };

        Runnable obj2= () ->{

            // public void run(){

            //     System.out.println(Thread.currentThread().getName());
            // }

             System.out.println(Thread.currentThread().getName());
        };

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}