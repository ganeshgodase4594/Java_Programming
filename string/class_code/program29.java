// To check the string is palinmdrome or not

import java.io.*;

class stringdemo{
	
	public static void main(String[] args)throws IOException{
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The String");

		String str1=br.readLine();

		char arr[]=str1.toCharArray();

		int temp=arr.length-1;

		int count=0;


		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==arr[temp]){
				
				count++;	

			}
			temp--;
		}

		System.out.println(count);

		if(arr.length==count){
			
			System.out.println("String are palindrome");
		}else{
			System.out.println("String are not palindrome");
		}

	}
}

/*
import java.io.*;

public class Main
{
    
    static boolean checkPalindrome(String str){
        	
		char arr[]=str.toCharArray();
		
		int left=0;
		int right = str.length()-1;
		
        
		while(left<right){
		    
		    if(arr[left]!=arr[right]){
		        
		            return false; 
		    }
		    
		    left++;
		    right--;
		}
		
		return true;
    }
	public static void main(String[] args)throws IOException {
	
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Enter The String");
	    
	    String str=br.readLine();
	    
	    
	    if(checkPalindrome(str)){
	        
	        System.out.println("Strings are Palindrome");
	    }else{
	        
	        System.out.println("Strings are not palindrome");
	    }
	    
	    
		
	}
}

*/

