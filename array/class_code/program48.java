//print the addition of row in array

import java.io.*;

class twodarray{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                int arr[][]=new int[3][3];

                for(int i=0;i<arr.length;i++){

                        for(int j=0;j<arr[i].length;j++){

                                arr[i][j]=Integer.parseInt(br.readLine());

                        }
                }


                System.out.println("Enter The 2D Array ");


                  for(int i=0;i<arr.length;i++){

                                int sum=0;

                        for(int j=0;j<arr[i].length;j++){

                                System.out.print(arr[i][j]+" ");

                                sum=sum+arr[i][j];


                        }

                        System.out.println("Sum Of Array in Coloumn is " + sum );
                }



        }
}
