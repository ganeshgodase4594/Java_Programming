/*
 
   2. Write a Program to reverse a given String.
Input String:
Core2Web Tech
Output String:
hcet beW2ero

 */

import java.io.*;

class ganesh{

static String reversestring(String str){
	
	char arr[]=str.toCharArray();

	String reverse="";
	
	int n=arr.length-1;

	for(int i=n;i>=0;i--){
		
		reverse=reverse+arr[i];
	}

	return reverse; 

}
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the string ");

		String reverse=br.readLine();

		System.out.println(reversestring(reverse));
	}
}
