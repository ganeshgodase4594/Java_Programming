//print the addition of addition of left digonal in array

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

		int sum=0;

                  for(int i=0;i<arr.length;i++){

                        for(int j=0;j<arr[i].length;j++){

                                if(arr[i][j]==arr[j][i]){
					
					sum=sum+arr[i][j];
				}


                        }
                }

		System.out.println("sum of left digonal is "+ sum);



        }
}
