// yeild...

class Mythread extends Thread{
	
	public void run(){
		
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo{
	
	public static void main(String[] args){
		
		Mythread obj=new Mythread();

		obj.start();

		obj.yield();

		System.out.println(Thread.currentThread().getName());
	}
}

// high priority will give to another method
// same as join
// not use in real life
