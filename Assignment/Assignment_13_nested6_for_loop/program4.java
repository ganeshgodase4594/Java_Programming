/*
 
Q4.

Write a program to take a range as input from the user and print perfect cubes between that range.
Input: Enter start: 1
Enter end: 100
Output: perfect cubes between 1 and 100


 */

import java.io.*;

class NestedDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter a Start");
                int start=Integer.parseInt(br.readLine());

                System.out.println("Enter a End");
                int end=Integer.parseInt(br.readLine());

		System.out.println("Print Perfect Cubes between " + start + " and " + end);

		for(int i=start;i<=end;i++){

			if(i*i*i<=end){

				System.out.println(i*i*i);
			}
		}
	}
}

