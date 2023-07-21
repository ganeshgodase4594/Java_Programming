// user defined exception..

import java.util.Scanner;

class dataoverflowexception extends RuntimeException{
	
	dataoverflowexception(String msg){
		
		super(msg);
	}
}

class dataunderflowexception extends RuntimeException{
	
	dataunderflowexception(String msg){
		
		super(msg);
	}
}

class ArrayDemo{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		int arr[]=new int[5];

		System.out.println("enter integer value");
		System.out.println("Note:0<element<100");

		for(int i=0;i<arr.length;i++){
			
			int data=sc.nextInt();

			if(data<0){
				
				throw new dataunderflowexception("data is less than 0");
			}

			if(data>100){
				
				throw new dataoverflowexception("data is greater than 100");
			}

			arr[i]=data;
		}

		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]+" ");
		}
	}
}
