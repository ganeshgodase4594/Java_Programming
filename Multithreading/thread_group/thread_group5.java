// using runnable..

class Mythread implements Runnable{
	
	public void run(){
		
		System.out.println(Thread.currentThread());

		try{

                Thread.sleep(1000);
        }catch(InterruptedException ie){

                System.out.println(ie.toString());
        }

	}
}

class ThreadGroup5{
	
	public static void main(String[] args){
		
		ThreadGroup pthreadgp=new ThreadGroup("india");

		Mythread obj1=new Mythread();
		Mythread obj2=new Mythread();

		Thread t1=new Thread(pthreadgp,obj1,"maha");
		Thread t2=new Thread(pthreadgp,obj2,"Goa");

		t1.start();
		t2.start();
	}
}
