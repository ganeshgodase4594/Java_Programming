// check anagram string

 
 import java.io.*;

 class anagram{

 boolean checkanagram(String str1,String str2){

     char arr1[]=str1.toCharArray();
     char arr2[]=str2.toCharArray();

     if(arr1.length!=arr2.length){

         return false;


     }else{

     for(int i=0;i<arr1.length;i++){

         for(int j=i+1;j<arr1.length;j++){

                if(arr1[i]>arr1[j]){

                char temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
                }

                if(arr2[i]>arr2[j]){

                char temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
              }
         }
     }


     for(int i=0;i<arr1.length;i++){

         if(arr1[i]!=arr2[i]){
	 	
		 return false;
	 }
     }
    }
    return true;
 }

public static void main(String[] args)throws IOException{
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter The String1");

	String str1=br.readLine();

	System.out.println("Enter the String2");

	String str2=br.readLine();

	anagram gg=new anagram();

	if(gg.checkanagram(str1,str2)){
		
		System.out.println("Strings are anagram");


	}else{
		
		System.out.println("strings are not anagram");
	}
}

 }
