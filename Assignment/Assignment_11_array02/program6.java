/*
Program 6:

WAP to take size of array from user and also take integer elements from user
find the maximum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: max element = 5

*/

import java.io.*;

class Assignment2{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int n=Integer.parseInt(br.readLine());

                int arr[]=new int[n];

                System.out.println("Enter The Elements In Array");


                for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }

                System.out.println("Print The Minimum Element In Array");

                int temp=arr[0];

                for(int i=1;i<arr.length;i++){

                        if(arr[i]>temp){

                                temp=arr[i];

                        }

                }

                System.out.println("Minimum Element In Array = "+ temp);
        }
}

