//take the input from user using arr.length variable

import java.io.*;

class ArryDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Enter The Size Of Array");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("take the array data from user");

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Print The Array");

		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);
		}
	
	}

}
