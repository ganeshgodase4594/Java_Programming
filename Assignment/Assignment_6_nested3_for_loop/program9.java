/*
Q9.

write a program to print the following pattern
1
8 27
64 125 216

*/

class pattern{

	public static void main(String[] args){

		int num=1;
		int row=3;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print((num*num*num)+" ");
				num++;
			}

			System.out.println();
		}
	}
}


