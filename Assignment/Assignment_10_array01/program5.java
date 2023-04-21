
import java.io.*;
class rcb{


        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                System.out.println("Enter The Elements In Array");

                for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());

                }

		System.out.println("Print The No Which Is Divisible By 5");

		for(int i=0;i<arr.length;i++){

			if(arr[i]%5==0){

				System.out.println(arr[i]);
			
			}
		}
	}
}

