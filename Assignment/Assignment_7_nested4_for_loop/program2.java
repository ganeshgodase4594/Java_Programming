/*

Q2.

write a program to print the following pattern

1
3 4
6 7 8
10 11 12 13
15 16 17 18 19

*/

class pattern{

	public static void main(String[] args){

	int num=0;
	int row=5;

	for(int i=1;i<=row;i++){

		num=num+i;
		int num1=num;

		for(int j=1;j<=i;j++){

			System.out.print(num1+" ");
			num1++;
		}
		System.out.println();
	}
}
}


