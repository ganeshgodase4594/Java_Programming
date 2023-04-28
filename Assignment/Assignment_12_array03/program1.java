/*
 
   
Program 1:

Write a program to print count of digits in elements of array.
Input: Enter array elements : 02 255 2 1554
Output: 2 3 1 4

 */


import java.io.*;
class Array03{

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");
		
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Take The Elements From User");

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Print The Count Of Digits In Element");

		

		for(int i=0;i<arr.length;i++){

			int temp=arr[i];
			int count=0;

			while(temp!=0){

				count++;

				temp=temp/10;
			
			}
			System.out.println(count);
		}


	}

}
