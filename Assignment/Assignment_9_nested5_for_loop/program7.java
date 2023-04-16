/*
 program 7 : write a program to print the following pattern
Row =5;
O
14 13
L K J
9 8 7 6
E D C B A

Row = 4
10
I H
7 6 5
D C B A

USE THIS FOR LOOP STRICTLY for the outer loop
Int row;
Take row from user
for(int i =1;i<=row;i++){
}
 */

import java.io.*;
class Magic{

        public static void main(String[] args)throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Row No And Column No");
		int row= Integer.parseInt(br.readLine());


		char ch = (char) (64 + ((row * row) + row) /2);
		int num = ((row * row) + row)/2;
		
		for(int i=1;i<=row;i++){


			for(int j=1;j<=i;j++){

				if(row % 2 == 1){

					if(i%2!=0){

						System.out.print(ch + "  ");
					}else{
					
						System.out.print(num + "  ");
					}
					ch--;
					num--;
				}else{
					if(i%2!=0){

						System.out.print(num + "  ");
					}else{
					
						System.out.print(ch + "  ");
					}
					num--;
					ch--;

				}

			
				
			}

			System.out.println();


		
		
		}

	}
}
