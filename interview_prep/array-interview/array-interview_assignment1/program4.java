/*
 
   4. Program 4:
Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and print even numbers from the array.
Input:
n=5
Enter elements in the array:
1
2
3
4
5
Output:
2
4



 */
import java.io.*;

class practice{

        static void solution(int arr[]){

                System.out.println("Output :");

                for(int i=0;i<arr.length;i++){

			if(arr[i]%2==0){
				
				System.out.println(arr[i]);
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
