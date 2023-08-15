

// sleep method

class  mythread extends Thread{

    public void run(){

        System.out.println(Thread.currentThread());
    }
}

class ThreadDemo2{

    public static void main(String[] args){

        System.out.println(Thread.currentThread());

        mythread obj=new mythread();
        obj.start();

        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){

        }
        

        Thread.currentThread().setName("ganesh");

        System.out.println(Thread.currentThread());
    }
}

// output:
// Thread[main,5,main]
// Thread[Thread-0,5,main]
// Thread[ganesh,5,main]

