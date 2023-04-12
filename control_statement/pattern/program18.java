/*
   1
   4 9
   16 25 36
   49 64 81 100
   
 */

class pattern{

        public static void main(String[] args){

                int num=1;
                int n=4;

                for(int i=1;i<=n;i++){

                        for(int j=1;j<=i;j++){

                                System.out.print((num*num)+" ");
                                num++;
                        }
                        System.out.println();
                }
        }
}
