/*
 Program 3 : write a program to print the following pattern
	10
	10 9
	9 8 7
	7 6 5 4
 */

class pattern{

	public static void main(String[] args){

		int num=10;
		int row=4;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print(num+" ");
				num--;
			}
			System.out.println();
			num++;
		}
	}
}
