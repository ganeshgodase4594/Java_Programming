
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            ob.secFrequent(arr, n);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    void secFrequent(String arr[], int N)
    {
        for(int i=0;i<arr.length;i++){
            
            int count=0;
            
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]==arr[j]){
                    
                    count++;
                }
            }
            
        }
    }
}