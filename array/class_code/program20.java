//take the array elememts from user and print the sum of all elements

import java.io.*;

class ArryDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


                System.out.println("Enter The Size Of Array");

                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                System.out.println("take the array data from user");
		int sum=0;

                for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());

			sum=sum+arr[i];
                }

                System.out.println(sum);

                //for(int i=0;i<arr.length;i++){

                  //      System.out.println(arr[i]);
               // }

        }

}
