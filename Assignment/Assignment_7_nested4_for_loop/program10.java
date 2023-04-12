
/*
Q10.
write a program to print the following pattern
1
8 9
9 64 25
64 25 216 49

*/

class pattern{

        public static void main(String[] args){

                int num=1;
                int row=4;

                for(int i=1;i<=row;i++){

                        num=i;

                        for(int j=1;j<=i;j++){

                                if(num%2!=0){

                                        System.out.print((num*num)+" ");
                                }else{
                                        System.out.print((num*num*num)+" ");
                                }
                                num++;
                        }

                        System.out.println();

                }
        }
}
