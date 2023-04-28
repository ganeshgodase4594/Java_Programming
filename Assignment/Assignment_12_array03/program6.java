/*

Program 6:

WAP to find a palindrome number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 564

Output: Palindrome no 252 found at index: 2



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

                System.out.println("Print The palindrome Number From Array And Reyurn It Index");

                for(int i=0;i<arr.length;i++){

			int temp=arr[i];
			int rev=0;

			while(temp!=0){

				int rem=temp%10;

				rev=(rev*10)+rem;


				temp=temp/10;
			}

			if(rev==arr[i]){

				System.out.println("Palondrome no  "+ rev + " found at index : " + i );
			}
		}
	}
}

                        

