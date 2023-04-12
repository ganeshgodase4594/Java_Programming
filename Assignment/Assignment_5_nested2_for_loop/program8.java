
/*
Q8

write a program to print the following pattern

A b C d
E f G h
I j K l
M n O p

*/

class pattern{

        public static void main(String[] args){

		char ch='A';
		char ab='a';

                for(int i=1;i<=4;i++){

                        for(int j=1;j<=4;j++){

				if(j%2!=0){

					System.out.print(ch+" ");
				}else{
					System.out.print(ab+" ");
				}

				ch++;
				ab++;
			}
			System.out.println();
		}
	}
}






