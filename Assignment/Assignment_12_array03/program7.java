/*
 
 Program 7:

WAP to find a Strong number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 564 145
Output: Strong no 145 found at index: 5

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

                System.out.println("Print The Strong Number From Array And Return It Index");

                for(int i=0;i<arr.length;i++){

                        int temp=arr[i];
                        int rev=0;
			int sum=0;
			

                        while(temp!=0){

                                int rem=temp%10;
				int fact=1;

                                for(int j=1;j<=rem;j++){

					 fact=fact*j;

				}

				sum=sum+fact;


                                temp=temp/10;
                        }

                        if(sum==arr[i]){

                                System.out.println("Strong no  "+ arr[i]+ " found at index : " + i );
                        }
                }
        }
}

