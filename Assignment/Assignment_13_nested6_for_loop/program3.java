/*
 
Q3.

Write a program to take a range as input from the user and print perfect squares between that range.
Input: Enter start: 1
Enter end: 100
Output: perfect squares between 1 and 100

 */

import java.io.*;

class NestedDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Start");
                int start=Integer.parseInt(br.readLine());

                System.out.println("Enter End");
                int end=Integer.parseInt(br.readLine());

		System.out.println("Print The Perfect Square in Given Series");

		for(int i=start;i<=end;i++){

			
			for(int j=1;j<end;j++){

				if(j*j==i){

					System.out.println(i);
				}
			}
		}
	}
}

