

import java.io.*;


class checkpalindrome{

    public static boolean ispalindromes(String str){

        char arr[]=str.toCharArray();

        int start=0;
        int end=arr.length-1;

        while(start<end){

            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        String newreverseString = new String(arr);

        if(newreverseString.equals(str)){

            return true;

        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Take the User String you want to : ");

        String str=br.readLine();

       if(ispalindromes(str)==true){

        System.out.println("given string is palindrom");

       }else{

        System.out.println("given string is not palindrom");

       }

        

    }

}

