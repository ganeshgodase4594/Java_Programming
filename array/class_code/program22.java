//another for loop
//take the input from user and print the multiplication of elements in array

import java.io.*;

class ArrayDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                System.out.println("Take The Array Element From User");

                int mult=1;

                for(int i=0;i<size;i++){

                        arr[i]=Integer.parseInt(br.readLine());

                       

                }

		for(int j=0;j<arr.length;j++){

			mult=mult*arr[j];
		
		}

                System.out.println(mult);

        }

}
