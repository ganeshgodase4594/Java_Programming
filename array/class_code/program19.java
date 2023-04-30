//take the input char from user and print them

import java.io.*;

class ArryDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


                System.out.println("Enter The Size Of Array");

                int size=Integer.parseInt(br.readLine());

                char arr[]=new char[size];

                System.out.println("take the array data from user");

                for(int i=0;i<arr.length;i++){

                        arr[i]=(char)br.read();
			br.skip(1);
                }

                System.out.println("Print The Array");

                for(int i=0;i<arr.length;i++){

                        System.out.println(arr[i]);
                }

        }

}
