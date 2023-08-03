/*
 
   8. Program 8:
Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from the user and find the frequency of digit
Input:
n=5
Enter elements in the array:
2
3
6
3
5
2
Output:
frequency of 2 is 2
frequency of 3 is 2
frequency of 6 is 1
frequency of 5 is 1

 */

 import java.io.*;

class practice{

         static void solution(int arr[]){

                System.out.println("Output :");
		
		for(int i=0;i<arr.length;i++){
			
			int count =0;

			for(int j=0;j<arr.length;j++){
				
				if(arr[i]==arr[j] ){
					
					count++;
				}
			}

			if(count>=2){

			 System.out.println("frequency of " + arr[i]+"is "+count);
		}else{
			
			System.out.println("frequency of " + arr[i]+ "is "+count);
		}
	}
}

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int n=Integer.parseInt(br.readLine());

                int arr[]=new int[n];

                System.out.println("Input :");

                for(int i=0;i<arr.length;i++){


                        arr[i]=Integer.parseInt(br.readLine());
                }

                solution(arr);

        }
}
