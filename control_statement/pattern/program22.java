/*
   1 4 3 16
   5 36 7
   8 81
   10
 */

class pattern{

        public static void main(String[] args){

                int num=1;
                int n=4;
                

                for(int i=1;i<=n;i++){

                        for(int j=1;j<=n-i+1;j++){

                                if(j%2!=0){


                                System.out.print((num)+" ");
                                }
                                else{
                                        System.out.print((num*num) +" ");
                                }

				num++;
                        }
                        System.out.println();
                }
        }
}
