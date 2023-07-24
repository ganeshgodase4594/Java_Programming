//

class Mythread extends Thread{
	
	public void run(){
		
		for(int i=0;i<10;i++){
			
			System.out.println("in run");
		}
	}
}

class ThreadDemo{
	
	public static void main(String[] args){
		
		Mythread obj=new Mythread();

		obj.start();

		for(int i=0;i<10;i++){
			
			System.out.println("in main");
		}
	}
}
