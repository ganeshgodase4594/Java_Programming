/*
6 5 4 3 2
7 5 3 1
8 5 2
9 5
10
*/

import java.io.*;
class Main{
    
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int row=Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){
            
                int c=row + i;
            
            for(int j=1;j<=row-i+1;j++){
                
                System.out.print(c +" ");
                c -= i;
            }
            System.out.println();
        }
    } 
}
