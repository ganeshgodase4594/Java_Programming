/* 
 Q2.
write a program to print the following pattern
1
2 3
4 5 6
7 8 9 10

*/

class pattern{

        public static void main(String[] args){

                int row=4;

		int num=1;

                for(int i=1;i<=row;i++){

                        for(int j=1;j<=i;j++){

                                System.out.print(num+ " ");
				num++;
                        }

                        System.out.println();
                }




        }
}
