
class demo extends Thread{
	
	public void run(){
		
		System.out.println("demo : "+ Thread.currentThread().getName());
	}
}

class mythread extends Thread{
	
	public void run(){
		
		System.out.println("demo : " + Thread.currentThread().getName());

		demo obj=new demo();
		obj.start();
	}
}

class threaddemo extends Thread{
	
	public static void main(String[] args){
		
		System.out.println("demo : "+ Thread.currentThread().getName());

		mythread obj=new mythread();
		obj.start();
	}
}

// demo main
// demo thread 0
// demo thread 1
