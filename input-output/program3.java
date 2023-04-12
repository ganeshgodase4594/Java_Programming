/*
 Take Input Using Buffer Reader
 */

import java.io.*;

class BufferDemo{

	public static void main(String[] args)throws IOException{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter your Name");
		String Name=br.readLine();

		System.out.println("My Name Is "+Name);

		System.out.println("Enter Your Age");

		int Age=Integer.parseInt(br.readLine());

		System.out.println("My Name Is "+Name);
		System.out.println("my Age is "+Age);
	}
}




