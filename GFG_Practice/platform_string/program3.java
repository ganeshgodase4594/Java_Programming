//{ Driver Code Starts
//reverse string in a given words

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        StringTokenizer st = new StringTokenizer(S, ".");
        
        String result[]=new String[st.countTokens()];
        
        int i=result.length-1;
        
        
        
        while(st.hasMoreTokens()){
            
            result[i]=st.nextToken();
            
            i--;
        }
        
        
        S=String.join(".",result);
        
        return S;
        
    }
}
