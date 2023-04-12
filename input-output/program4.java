/*
 Take Input User 
 Enter User favourite Batsman And bolwer Name:
 */

import java.io.*;

class BufferDemo{

	public static void main(String[] args)throws IOException{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter your favourite Batsman Name");
		String Batsman_name=br.readLine();

		System.out.println("Enter Your Favourite Bowler Name");
		String Bowler_name=br.readLine();

		System.out.println("My Favourite Batsman Is "+Batsman_name);
		System.out.println("My Favourite Bowler Name Is "+Bowler_name);
	}
}
