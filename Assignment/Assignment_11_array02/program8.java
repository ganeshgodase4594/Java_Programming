/*
 
   Program 8
WAP to find the uncommon elements between two arrays.
Input :
Enter first array : 1 2 3 5i
Enter Second array: 2 1 9 8
Output: Uncommon elements :
3
5
9
8

 */

import java.io.*;

class Assignment2{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int n=Integer.parseInt(br.readLine());

                int arr1[]=new int[n];
                int arr2[]=new int[n];

                System.out.println("Enter The Array1 Elements In Array");


                for(int i=0;i<n;i++){

                        arr1[i]=Integer.parseInt(br.readLine());

                }

                System.out.println("Enter The Array2 Elements In Array ");

                for(int j=0;j<n;j++){

                        arr2[j]=Integer.parseInt(br.readLine());
                }



                System.out.println("Print The uncommom Element In Array1 and Array2");


		boolean uncommon =false;



                for(int i=0;i<n;i++){


                        for(int j=0;j<n;j++){

                                if(arr1[i]==arr2[j] || arr2[i]==arr1[j]){

					uncommon=false;
					break;
				}else{

					uncommon=true;
				}
			}

			if(uncommon){

				System.out.println(arr1[i]+ " " + arr2[i] );
			
			}
		}
	}
}
