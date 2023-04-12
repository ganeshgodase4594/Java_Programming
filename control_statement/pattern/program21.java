/*
   A 1 B 2
   C 3 D
   E 4
   F
 */

class pattern{

        public static void main(String[] args){

                int num=1;
                int n=4;
		char ch ='A';

                for(int i=1;i<=n;i++){

                        for(int j=1;j<=n-i+1;j++){

				if(j%2!=0){


                                System.out.print((ch++)+" ");
				}
				else{
					System.out.print((num++) +" ");
				}
                        }
                        System.out.println();
                }
        }
}
