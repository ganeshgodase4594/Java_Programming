
//check the string length are equal or not ..using mylenth function..

import java.io.*;
class MyLengthdemo{

	static int mylenth(String str){

		char arr[]=str.toCharArray();
		
			int count=0;

		for(int i=0;i<arr.length;i++){
			
			count++;
		}

		return count;
		

	}
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first string");
		String str1=br.readLine();

		System.out.println("Enter Second String");
		String str2=br.readLine();

		if(mylenth(str1)==mylenth(str2)){
			
			System.out.println("length are equal");

		}else{
			
			System.out.println("length are not equal");
		}
	}
}
