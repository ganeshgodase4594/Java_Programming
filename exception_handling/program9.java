/*
 Number Format Exception
 */

import java.io.*;

class exceptiondemo{

	public static void main(String[] args){
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		String str=null;
		try{
			
			 str=br.readLine();

		}catch(IOException ie){
		
			 System.out.println(str);
		}


		int data=0;

		try{
			
			data=Integer.parseInt(br.readLine());

		}catch(Exception obj){
			
			System.out.println("please ! Enter The Intger Value");

		}

		System.out.println(data);
	}
}
