
 
/*

Program 2
WAP to reverse each element in an array.
Take size and elements from the user
Input: 10 25 252 36 564
Output: 01 52 252 63 465

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

                System.out.println("Print The reverse each element in array ");


                for(int i=0;i<arr.length;i++){

                        int temp=arr[i];
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
