
// create java_thread_pool

import java.util.concurrent.*;

class Mythread implements Runnable{
	
	int num;

	Mythread(int num){
	
		this.num=num;
	}

	public void run(){
		
		System.out.println(Thread.currentThread() + "start Thread" +num);

		dailyTask();

		System.out.println(Thread.currentThread() + "start Thread " + num);
	}

	void dailyTask(){
		
		try{
			
			Thread.sleep(8000);
		}catch(InterruptedException obj){
		
		}
	}
}

class Thread_Pool{
	
	public static void main(String[] args){
		
		ExecuteService ser=Executeors.newCachedThreadPool();

		for(int i=0;i<6;i++){

			Mythread obj=new Mythread();
			
			ser.execute(obj);
		}

		ser.shutdown();
	}
}

// error ; 
