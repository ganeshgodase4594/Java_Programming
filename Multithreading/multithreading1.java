

// sleep method

class  mythread extends Thread{

    public void run(){

        System.out.println(Thread.currentThread());
    }
}

class ThreadDemo1{

    public static void main(String[] args){

        System.out.println(Thread.currentThread());

        mythread obj=new mythread();
        obj.start();

        Thread.currentThread().setName("ganesh");

        System.out.println(Thread.currentThread());
    }
}

