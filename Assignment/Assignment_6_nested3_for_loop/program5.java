/* Q5
write a program to print the following pattern

10 10 10 10
11 11 11
12 12
13

*/

class pattern{

        public static void main(String[] args){

                int row=4;
		int num=10;


                for(int i=1;i<=row;i++){

                        for(int j=1;j<=row-i+1;j++){

                                System.out.print(num+" " );

                        }

			num++;

                        System.out.println();
                }




        }
}
