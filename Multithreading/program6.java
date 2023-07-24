// creating thread using runnable interface

class mythread implements Runnable{
	
	public void run(){
		
		System.out.println("in run");

		System.out.println(Thread.currentThread().getName());
	}
}

class threaddemo{
	
	public static void main(String[] args){
		
		mythread obj=new mythread();

		Thread t=new Thread(obj);

		t.start();

		System.out.println(Thread.currentThread().getName());
	}
}
