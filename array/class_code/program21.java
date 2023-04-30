//take the input from user and print the multiplication of array elements

import java.io.*;

class ArrayDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Take The Array Element From User");

		int mult=1;

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(br.readLine());

			mult=mult*arr[i];
		
		}

		System.out.println(mult);
	
	}

}
