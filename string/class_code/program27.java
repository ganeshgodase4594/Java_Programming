// compare the two string without using any function ....write my code..

import java.io.*;

class comparetodemo{

	static int mycompareto(String str1,String str2){

		char arr1[]=str1.toCharArray();

		char arr2[]=str2.toCharArray();

		int max=0;

		if(arr1.length>arr2.length){
			
			max= arr1.length-arr2.length;

		}else if(arr2.length>arr1.length){
			
			max= arr2.length-arr1.length;
		}else{
			 max=arr1.length;
		}


		for(int i=0;i<max;i++){

			if(arr1.length>arr2.length){
				
				return arr1.length-arr2.length;
			
			}else if(arr1.length<arr2.length){

				
			
				return arr1.length-arr2.length;

			}else if (arr1[i]!=arr2[i]){
				
				return arr1[i]-arr2[i];
			}
		}

		return 0;
	}


        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The String1");

                String str1= br.readLine();

                System.out.println("Enter The String2");

                String str2=br.readLine();

                System.out.println(mycompareto(str1,str2));

		

        }
}

// this code one test case is fail
