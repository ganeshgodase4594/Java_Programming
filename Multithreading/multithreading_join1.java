
class mythread3 extends Thread{

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
class ThreadDemo4{

    public static void main(String[] args) {
        
        mythread3.nmmain=Thread.currentThread();

        mythread3 obj=new mythread3();
        obj.start();

        try{

            obj.join();
        }catch(InterruptedException oj){
            
            
        }

        for(int i=0;i<10;i++){

            System.out.println("in main");
        }
    }
}