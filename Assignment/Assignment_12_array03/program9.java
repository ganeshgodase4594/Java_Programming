/*
 
 Program 9:

Write a program to print the second max element in the array
Input: Enter array elements: 2 255 2 1554 15 65
Output: 255

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

		int max=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i]>max){

				max=arr[i];
			}
		}

		int secmax=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i]>secmax && arr[i]<max){

				secmax=arr[i];
			}

		
		}
		System.out.println("Second Largert Element In Array= " + secmax);
	}
}
