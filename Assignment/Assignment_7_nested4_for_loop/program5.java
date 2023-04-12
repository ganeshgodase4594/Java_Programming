/*
    
Q5.
write a program to print the following pattern

A B C D
B C D
C D
D

*/

class pattern{

        public static void main(String[] args){

                //char ch='A';
                int row=4;

                for(int i=1;i<=row;i++){

			//char ch1=ch;

                        for(int j=1;j<=row-i+1;j++){


                                System.out.print((char)(63 + i + j)+" ");
                                
                        }
                        System.out.println();
                        
                }
        }
}
