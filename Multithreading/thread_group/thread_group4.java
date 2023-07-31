
class Mythread extends Thread{
	
	Mythread(ThreadGroup tg,String str){
		
		super(tg,str);

	}

	public void run(){
		
		System.out.println(Thread.currentThread());

		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			
			System.out.println(ie.toString());
		}
	}
}

class ThreadGroup4{
	
	public static void main(String[] args)throws InterruptedException{
		
		ThreadGroup pthreadgp=new ThreadGroup("India");

		Mythread t1=new Mythread(pthreadgp,"Maharashtra");
		Mythread t2=new Mythread(pthreadgp,"HP");

		t1.start();
		t2.start();


                ThreadGroup pthreadgp1=new ThreadGroup("Pakistan");

                Mythread t3=new Mythread(pthreadgp1,"Province");
                Mythread t4=new Mythread(pthreadgp1,"Balochistan");

                t3.start();
                t4.start();


                ThreadGroup pthreadgp2=new ThreadGroup("Bangladesh");

                Mythread t5=new Mythread(pthreadgp2,"Dhaka");
                Mythread t6=new Mythread(pthreadgp2,"khulna");

                t5.start();
                t6.start();

		System.out.println(Thread.activeCount());
		System.out.println(pthreadgp.activeGroupCount());

	}
}
