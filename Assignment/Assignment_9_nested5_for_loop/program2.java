/*
 
Q2
write a program to print the following pattern
# = = = =
= # = = =
= = # = =
= = = # =
= = = = #

USE THIS FOR LOOP STRICTLY for the outer loop
Int row;
Take the number of rows from user
for(int i =1;i<=row;i++){
}
   */

import java.io.*;
class Magic{

        public static void main(String[] args)throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The No Of Col And Rows");

                int row=Integer.parseInt(br.readLine());

                int col=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){

			for(int j=1;j<=col;j++){

				if(i==j){

					System.out.print("# ");
				}else{

					System.out.print("= ");
				
				
				}
			}

			System.out.println();

		
		}

		
	}
}
