/*
 
 Q6.

Write a program to take 5 numbers as input from the user and print the count of digits in those
numbers.
Input: Enter 5 numbers :
5
The digit count in 5 is 1
25
The digit count in 25 is 2
225
The digit count in 225 is 3
6548
The digit count in 6548 is 4
852347
The digit count in 852347 is 6

 */


import java.io.*;

class NestedDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 5 Numbers");

		for(int i=1;i<=5;i++){


			int no=Integer.parseInt(br.readLine());

			int count=0;
			int temp=no;

			while(no!=0){

				count++;

				no=no/10;
			}

			System.out.println("The digit count in " + temp + " is " + count);
		}
	}
}

	

