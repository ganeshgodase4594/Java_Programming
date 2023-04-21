/*
 
  Program 9:
Write a Java program to merge two given arrays.
Array1 = [10, 20, 30, 40, 50]
Array2 = [9, 18, 27, 36, 45]
Output :
Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
Hint: you can take 3rd array

 */

import java.io.*;

class Main{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array1");

                int x=Integer.parseInt(br.readLine());

		System.out.println("Enter The Size Of Array2");

		int y=Integer.parseInt(br.readLine());

                int arr1[]=new int[x];
                int arr2[]=new int[y];
		int arr3[]=new int[x+y];

                System.out.println("Enter The Array1 Elements In Array");


                for(int i=0;i<arr1.length;i++){

                        arr1[i]=Integer.parseInt(br.readLine());

                }

                System.out.println("Enter The Array2 Elements In Array ");

                for(int j=0;j<arr2.length;j++){

                        arr2[j]=Integer.parseInt(br.readLine());
                }



                for(int i=0;i<arr1.length;i++){

			arr3[i]=arr1[i];
		
		}

		int num=0;

		for(int i=x;i<arr3.length;i++){

			arr3[i]=arr2[num];
			num++;
		
		}

		System.out.println("Print The Merged Array");

		for(int i=0;i<arr3.length;i++){

			System.out.println(arr3[i]);
		
		
		}
	}
}



