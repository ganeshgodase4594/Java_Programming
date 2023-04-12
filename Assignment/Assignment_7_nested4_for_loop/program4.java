
/*
 Q4.
write a program to print the following pattern

1 2 3 4
2 3 4
3 4
4

*/

class pattern{

        public static void main(String[] args){

                int num=1;
                int row=4;

                for(int i=1;i<=row;i++){

			num=i;

                        for(int j=1;j<=row-i+1;j++){

                                System.out.print(num+" ");
                                num++;
                        }
                        System.out.println();
                }
        }
}
