
import java.io.*;

class StringDemo {
	
	static void checkPalindromeString(String str) {

		char arr[]=str.toCharArray();

                int temp=arr.length-1;

                int count=0;


                for(int i=0;i<arr.length;i++){

                        if(arr[i]==arr[temp]){

                                count++;

                        }
                        temp--;
                }


                if(arr.length==count){

                        System.out.println("String are palindrome");
                }else{
                        System.out.println("String are not palindrome");
                }
	}

	boolean checkAnagramString(String str1, String str2) {
		
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
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		StringDemo obj = new StringDemo();

		System.out.println("----------Check Palindrome String------------\n");

		System.out.println("Enter String : ");
		String str = br.readLine();

		checkPalindromeString(str);
		System.out.println("----------Check Anagram String------------\n");

		System.out.println("Enter 1st String : ");
		String str1 = br.readLine();
		System.out.println("Enter 2nd String : ");
		String str2 = br.readLine();

		if(obj.checkAnagramString(str1,str2)) {
			
			System.out.println("Anagram String");
		}else {

			System.out.println("Not Anagram String");
		}

	}
}
