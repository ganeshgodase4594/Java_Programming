// Copy The One Element In To Another Element


import java.io.*;

class Main{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


                System.out.println("Enter The Size Of Array");

                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];
                int arr1[]=new int[size];


                System.out.println("take the array data from user");



                for( int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());

                        arr1[i]=arr[i];
                }

                System.out.println("print the arr[] element in arr1[]");



                for(int j=0;j<arr.length;j++){

                    System.out.println(arr1[j]);
                }





        }
}




