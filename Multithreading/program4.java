
class mythread extends Thread{
	
	public void run(){
		
		System.out.println("in run");

		System.out.println(Thread.currentThread().getName());
	}

	public void start(){
		
		System.out.println("in mythread start");

		run();
	}
}

class Mythread{
	
	public static void main(String[] args){
		
		mythread obj=new mythread();

		obj.start();

		System.out.println(Thread.currentThread().getName());
	}
}

// 
