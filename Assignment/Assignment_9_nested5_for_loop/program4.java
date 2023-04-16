/*
 

Q4.

WAP to print all even numbers in reverse order and odd numbers in the standard way. Both separately.
Within a range. Take the start and end from user
Input: Enter start number - 2
Enter End number - 9
Output:
8 6 4 2
3 5 7 9
 
*/

import java.io.*;
class Magic{

        public static void main(String[] args)throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Start No And End No");

                int start=Integer.parseInt(br.readLine());

                int end=Integer.parseInt(br.readLine());


		for(int i=end;i>=start;i--){

			if(i%2==0){

				System.out.print(i+ " ");

				
			}
		}
			System.out.println();
			

		         for(int j=start;j<=end;j++){

			       if(j%2!=0){

			           System.out.print(j+ " ");
				  

			}
			 }
	}
}	
		
