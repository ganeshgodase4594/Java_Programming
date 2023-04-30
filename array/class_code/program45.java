// 2D Array Take Input From User And Print The Number

import java.io.*;

class twodarray{

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int arr[][]=new int[4][6];

		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[i].length;j++){

				arr[i][j]=Integer.parseInt(br.readLine());

			}
		}

		System.out.println("Enter The 2D Array ");

		  for(int i=0;i<arr.length;i++){

                        for(int j=0;j<arr[i].length;j++){

                                System.out.print(arr[i][j]+" ");

                        }

			System.out.println();
                }


	}
}
