/*
 E  d  C  b  A
 D  c  B  a
 C  b  A
 B  a
 A

 */

import java.io.*;
class Main{


    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int row=Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){
		
            for(int j=1;j<=row-i+1;j++){

		    if(j%2==1){
		    	
			System.out.print((char)((66 + row - i) - j) + " ");
		   	
		    }else{
			System.out.print((char)(((66 + row - i) - j) + 32) + " ");
			
		    }
                
            }
	    System.out.println();
        }
    }
}
