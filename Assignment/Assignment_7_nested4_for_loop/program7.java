/*
Q7.
write a program to print the following pattern

F
E 1
D 2 E
C 3 D 4
B 5 C 6 D
A 7 B 8 C 9

*/

class pattern{

        public static void main(String[] args){

                
                int row=6;
		char ch='F';
		int num=1;

                for(int i=1;i<=row;i++){
			char ch1 = ch;
                        for(int j=1;j<=i;j++){

			   if(j%2!=0){

                                System.out.print(ch1++ +" ");
                           }else{

                        	System.out.print(num++ +" ");
			   }
                }
		System.out.println();
		ch--;
		}
	}
}

