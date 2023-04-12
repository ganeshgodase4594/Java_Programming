/* Q4.
 write a program to print the following pattern

 1A 2B 3C
 1A 2B 3C
 1A 2B 3C

*/

class pattern{

        public static void main(String[] args){

                for(int i=1;i<=3;i++){

			char ch='A';
			int num=1;

                        for(int j=1;j<=3;j++){

				System.out.print(num);
				System.out.print(ch+" ");
				ch++;
				num++;
			}

			System.out.println();
		
		
		}

		
	}
}
