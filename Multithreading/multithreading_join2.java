
class mythread4 extends Thread{

    public static Thread nmmain;

    public void run(){

        try{

            nmmain.join();
        }catch(InterruptedException ie){

        }

        for(int i=0;i<10;i++){

            System.out.println("Thread-0");
        }
    }
}
class ThreadDemo5{

    public static void main(String[] args) {
        
        mythread4.nmmain=Thread.currentThread();

        mythread4 obj=new mythread4();
        obj.start();

        try{

            obj.join(5000);
        }catch(InterruptedException oj){
            
            
        }

        for(int i=0;i<10;i++){

            System.out.println("in main");
        }
    }
}