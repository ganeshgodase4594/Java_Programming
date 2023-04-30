//take the input from user and print the odd and even elements in array

import java.io.*;

class ArrayDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                System.out.println("Take The Array Element From User");


                for(int i=0;i<size;i++){

                        arr[i]=Integer.parseInt(br.readLine());
		}

		for(int j=1;j<arr.length;j++){

			if(arr[j]%2==0){

				System.out.println("Even No Are"+arr[j]);
			}else{
				System.out.println("Odd No Are"+arr[j]);
			
			}
		}
	}
}

                
			       
