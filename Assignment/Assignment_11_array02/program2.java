/*
 
Program 2;

WAP to find the number of even and odd integers in a given array of integers
Input: 1 2 5 4 6 7 8
Output:
Number of Even Elements: 4
Number of Odd Elements : 3

 */
import java.io.*;

class Assignment2{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int n=Integer.parseInt(br.readLine());

                int arr[]=new int[n];

                System.out.println("Enter The Elements In Array");

                int sum=0;

                for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());

                }

		int even=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i]%2==0){

				even++;
			
			}
		
		
		}

                System.out.println("Number of even element is = " + even);
		System.out.println("Number of odd elements is = " + (arr.length-even));
        }
}
