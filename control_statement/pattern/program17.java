/*
   A B C D
   A B C
   A B
   A
   
 */

class pattern{

        public static void main(String[] args){

               
                int n=5;

                for(int i=1;i<=n;i++){

			char ch='A';

                        for(int j=1;j<=n-i+1;j++){

                                System.out.print(ch+" ");

                                ch++;
                        }
                        System.out.println();
                }
        }
}
