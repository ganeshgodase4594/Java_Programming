/*
 
   1. Write a Program to search for a given String in an array of Strings.
Input Strings:
Shashi,Ashish,Kanha,Rahul,Badhe
String to Search:
Kanha
Output:
String found at index : 2

 */

import java.io.*;

class demo{


	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the size of Strings");

		int n=Integer.parseInt(br.readLine());

		String arr[]=new String[n];

		System.out.println("enter the strings in array");

		for(int i=0;i<arr.length;i++){
			
			arr[i]=br.readLine();
		}

		System.out.println("enter the string do you want to search");

		String target_string=br.readLine();

		solution obj=new solution();

		System.out.println("string " + target_string + "is find at index " + obj.searchindex(arr,target_string));
	}
}

class solution{
	
	static int  searchindex(String arr[],String target_string){
		
		for(int i=0;i<arr.length;i++){
			
			if(target_string.equals(arr[i])){
				
				return i;
			}
		}

		return -1;
	}
}
