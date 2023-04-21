/*
 
Program 4
Write a program, take 7 characters as an input , Print only vowels from the array
Input: a b c o d p e
Output : a o e


 */

import java.io.*;

class Array{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");

		int size=Integer.parseInt(br.readLine());

		char arr[]=new char[size];

		System.out.println("Enter The Elements In Array");

		for(int i=0;i<arr.length;i++){

			arr[i]=(char)br.readLine().charAt(0);

		}

		System.out.println("Print The Oval Elements");

		for(int i=0;i<arr.length;i++){

			if(arr[i]=='a' || arr[i]=='A'){

				System.out.println(arr[i]);
			}else if(arr[i]=='e' || arr[i]=='E'){

				System.out.println(arr[i]);
			}else if(arr[i]=='i'|| arr[i]=='I'){

				System.out.println(arr[i]);
			}else if(arr[i]=='o' || arr[i]=='O'){

				System.out.println(arr[i]);
			
			}else if(arr[i]=='u' || arr[i]=='U'){
				System.out.println(arr[i]);
			
			}
		}
	}
}


 
