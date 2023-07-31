
class Mythread extends Thread{
	
	Mythread(String str){
		
		super(str);
	}

	public void run(){
		
		System.out.println(getName());

		System.out.println(Thread.currentThread().getThreadGroup());
	}
}

class ThreadGroup1{
	
	public static void main(String[] args){
		
		Mythread obj=new Mythread("XYZ");

		obj.start();

		System.out.println(Thread.currentThread().getThreadGroup());

	}
}
