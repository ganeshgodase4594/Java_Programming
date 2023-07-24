

import java.io.*;


class checkpalindrome{

    public static boolean ispalindromes(String str){

        char arr[]=str.toCharArray();

        int start=0;
        int end=arr.length-1;

        while(start<end){

            if(str.charAt(start)!=str.charAt(end)){

                return false;

                

            }
                start++;
                end--;


        }

        return true;
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

