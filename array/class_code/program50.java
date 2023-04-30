//print the additin of right digonal element in array

import java.util.*;

class ArrayDemo{
	
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The No Of Row");

		int row=sc.nextInt();

		System.out.println("Enter The No Of Coloumn");

		int col=sc.nextInt();

		int arr[][]=new int[row][col];

		System.out.println("Enter The Elements In Array");

		for(int i=0;i<arr.length;i++){
			

			for(int j=0;j<arr[i].length;j++){
				
				arr[i][j]=sc.nextInt();
			}
		}

		int num1=0;
		int num2=row-1;
		int sum=0;

		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
				
				sum=sum+arr[num1][num2];

				num1++;
				num2--;
			}

			break;


		}

		System.out.println("sum of right digonal in array is "+ sum);

	}
}
