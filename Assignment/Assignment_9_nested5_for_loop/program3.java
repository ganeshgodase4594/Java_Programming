     
/*
 
Q3
write a program to print the following pattern
5 4 3 2 1
8 6 4 2
9 6 3
8 4
5


  */





import java.io.*;
class Magic{

        public static void main(String[] args)throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The No Of Col And Rows");

                int row=Integer.parseInt(br.readLine());

                int col=Integer.parseInt(br.readLine());


		int temp = row;

		for(int i = 1; i <= row; i++){
			
			int num = temp * i;

			for(int j = row; j >= i;j--){

				System.out.print(num + " ");
				num = num - i;
			}

			temp--;

			System.out.println();
		}
	}
}
