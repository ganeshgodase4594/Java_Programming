/*
 
Program 5
WAP to find a Perfect number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 496 564
Output: Perfect no 496 found at index: 3


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

                System.out.println("Print The Perfect Number From Array");

		for(int i=0;i<arr.length;i++){

			int sum = 0;

			for(int j=1;j<arr[i];j++){

				if(arr[i]%j==0){

					sum=sum+j;
				}


			}

			if(sum==arr[i]){

				System.out.println("Perfect no " + arr[i] + "found at index : " + i);
			}
		}
	}
}


