
/*
Q6.
write a program to print the following pattern

1
2 3
3 4 5
4 5 6 7

*/

class pattern{

        public static void main(String[] args){

                //int num=1;
                int row=4;

                for(int i=1;i<=row;i++){

			//num=i;

                        for(int j=1;j<=i;j++){

                                System.out.print((i + j) - 1 +" ");
                                //num++;
                        }
                        System.out.println();
                        //num--;
                }
        }
}
