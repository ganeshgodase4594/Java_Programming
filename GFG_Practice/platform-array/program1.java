

// Second Largest

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

class Solution {
    int print2largest(int arr[], int n) {
    
        int min=arr[0];
        int flag = 0;
        for(int i=1;i<arr.length;i++){   
            
            if(arr[i]<arr[0]){
                
                min=arr[i];
            }
        
        }
        for(int i = 1; i < arr.length; i++){
                
                int sub = arr[i - 1] - arr[i];
                if(sub == 0){
                    flag = 1;
                }else{
                    flag = 0;
                    break;
                }
        }
        
        
            
        int firstmax = min;
        int secmax  = min;
        
        if(flag == 0){
            
            for(int i=0;i<arr.length;i++){
                
                if(arr[i]>firstmax){
                    
                    secmax=firstmax;
                    firstmax=arr[i];
                    
                }else if(secmax<arr[i] && firstmax!=arr[i]){
                    
                    secmax=arr[i];
                }
                
            }
        }else{
            
            return  -1;
        }
        
        return secmax;
  }
}
        
  
