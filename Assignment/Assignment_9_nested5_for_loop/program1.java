/*
 Q1
write a program to print the following pattern

D4 C3 B2 A1
A1 B2 C3 D4
D4 C3 B2 A1
A1 B2 C3 D4

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

		int temp=row+1;
		char ch=(char)(64+row+1);

		for(int i=1;i<=row;i++){

			for(int j=1;j<=col;j++){	

				if(i%2==0){																				

					System.out.print(ch);
					System.out.print(temp+" ");
					ch++;
					temp++;



				}else{
					ch--;
					temp--;

                                System.out.print(ch);
                                System.out.print(temp+" ");
				}
			}
			System.out.println();
		}
	}
}

	





	


  

  
