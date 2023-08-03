/*
 
   2. Program 2:
Write a program to create an array of 5 integer elements.
Insert from the user and print 5 elements from an array
Input:
1
2
3
4
5
Output :
1
2
3
4
5


 */

import java.io.*;

class practice{
	
	void solution(int arr[]){

		System.out.println("Output :");
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int arr[]=new int[5];

		System.out.println("Input :");

		for(int i=0;i<arr.length;i++){
			
			arr[i]=Integer.parseInt(br.readLine());
		}

		practice obj=new practice();

		obj.solution(arr);

	}
}
