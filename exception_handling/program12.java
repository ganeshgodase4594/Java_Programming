// interrupted exception..

import java.io.*;

class demo{
	
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			
			System.out.println("___");


		}

		try{
			
			Thread.sleep(4000);
		}catch(RuntimeException gr){
			
			
		}catch(InterruptedException obj){
		
		}
	}
}
