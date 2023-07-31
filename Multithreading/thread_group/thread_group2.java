// make thradgroup with its threads

class Mythread extends Thread{

	Mythread(ThreadGroup tg,String str){
		
		super(tg,str);
	}

	public void run(){
		
		System.out.println(Thread.currentThread());
	}
}

class ThreadGroup2{
	
	public static void main(String[] args){
		
		ThreadGroup pthreadgp=new ThreadGroup("core2web");

		Mythread obj1=new Mythread(pthreadgp,"c");
		Mythread obj2=new Mythread(pthreadgp,"cpp");
		Mythread obj3=new Mythread(pthreadgp,"Java");

		obj1.start();
		obj2.start();
		obj3.start();
	}
}
