//{ Driver Code Starts
//Initial Template for Java
//
//reverse a string 

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        char arr[]=str.toCharArray();
        
        String gana="";
        
        for(int i=arr.length-1;i>=0;i--){
            
            gana=gana+arr[i];
        }
        
        return gana;
    }
    
}

*/

/*

class Reverse{
    
    public static String reverseWord(String str){
        
        char arr[]=str.toCharArray();
        
        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            
            String str=arr[start];
            arr[start]=arr[end];
            arr[end]=str;
            
            start++;
            end--;
        }
        
        return str;
    }
}

*/



class Reverse{
    
    public static String reverseWord(String str){
        
        StringBuffer gana=new StringBuffer(str);
        
        
        gana.reverse();
        
        return gana.toString();
    }
}


