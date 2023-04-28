/*
 
   
 Program 8:

WAP to find an ArmStong number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 153 55 89

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

                System.out.println("Print The Armstrong Number From Array And Return It Index");

                for(int i=0;i<arr.length;i++){

                        int temp=arr[i];
                        int sum=0;
			int count=0;


                        while(temp!=0){

                                count++;

				temp=temp/10;
			}

			temp=arr[i];

			while(temp!=0){

				int rem=temp%10;

				int mult=1;
		

                                for(int j=1;j<=count;j++){

                                         mult=mult*rem;

                                }

                                sum=sum+mult;


                                temp=temp/10;
                        }

                        if(sum==arr[i]){

                                System.out.println("Armstrong no  "+ arr[i]+ " found at index : " + i );
                        }
                }
        }
}

