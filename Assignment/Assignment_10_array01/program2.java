/*
 

   Program 2:

WAP to take size of array from user and also take integer elements from user Print
product of even elements only
input : Enter size : 9
Enter array elements : 1 2 3 2 5 10 55 77 99
output : 40
// 2 * 2 * 10


 */

import java.io.*;
class rcb{

	
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter The Elements In Array");

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
		
		}

		int mult=1;

		for(int j=0;j<arr.length;j++){

			if(arr[j]%2==0){

				mult=mult*arr[j];
			}
		}

		System.out.println("multiplication of elements in array = " + mult);


	}

}

