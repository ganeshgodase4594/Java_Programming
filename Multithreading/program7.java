// priority of threads...

class mythread extends Thread{
	
	public void run(){
		
		Thread t=Thread.currentThread();
		
		System.out.println(t.getPriority()); // default 5
						     // after setpriority 7
	}
}

class ThreadDemo{
	
	public static void main(String[] args){
		
		Thread t=Thread.currentThread();

		System.out.println(t.getPriority());  // default 5

		mythread obj=new mythread();

		obj.start();

		t.setPriority(7);

		mythread obj2=new mythread();

		obj2.start();
	}
}

// default 5: 
// 5
// 7
