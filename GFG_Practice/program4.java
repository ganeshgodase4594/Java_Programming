// duplicate elements in array

import java.util.*;

class gfg{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array");
		int n=sc.nextInt();

		int arr[]=new int[n];

		System.out.println("take the input from user");

		for(int i=0;i<arr.length;i++){
			
			arr[i]=sc.nextInt();
		}

		gfg obj=new gfg();

		int arr1[]=obj.duplicate(arr,n);

		for(int i=0;i<arr1.length;i++){
			
			System.out.println(arr1[i]);
		}



	}

	int[] duplicate(int arr[],int n){
		
		// sort the arrays

		Arrays.sort(arr);

		boolean flag;

		int a[]=new int[n];

		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
				
					a[i]=arr[i];

				}
			}
		}

		return a;
	}
}
