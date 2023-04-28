/*
 
  Q.10:
   
 Write a program to take range as input from the user and print Armstrong numbers. ( Take a start and
end number from a user )
Input: Enter start: 1
Enter end: 1650
Output: Armstrong numbers between 1 and 1650
1 2 3 4 5 6 7 8 9 153 370 371 407 1634

 */

import java.io.*;

class NestedDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter a Start");
                int start=Integer.parseInt(br.readLine());

                System.out.println("Enter a End");
                int end=Integer.parseInt(br.readLine());

                System.out.println("Print The Armstrong Numbers between " + start + " and " +end);

                for(int i=start;i<=end;i++){

                        int temp=i;

			int count=0;


                        int sum=0;

                        while(temp!=0){

                                count++;

				 temp=temp/10;
			}

			temp=i;

			while(temp!=0){

				int mult=1;

				int rem=temp%10;

				for(int j=1;j<=count;j++){

				        mult=mult*rem;
				}

				sum=sum+mult;

				temp=temp/10;

			}

                        if(sum==i){

                                System.out.println(i);
                        }
                }
        }
}

