/*
 
 Q7.

Write a program to take range as input from the user and print the reverse of all numbers. ( Take a
start and end number from a user )
Input: Enter start: 100
Enter end: 200
Output: Palindrome numbers between 100 and 250

 */


import java.io.*;

class NestedDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter a Start");
                int start=Integer.parseInt(br.readLine());

                System.out.println("Enter a End");
                int end=Integer.parseInt(br.readLine());

                System.out.println("Print The reverse Numbers between " + start + " and " +end);

                for(int i=start;i<=end;i++){

			int temp=i;

			int rev=0;

			while(temp!=0){

				int rem=temp%10;

				rev=(rev*10)+rem;

				temp=temp/10;
			}
			
			System.out.println(rev);
		}
	}
}

                        
