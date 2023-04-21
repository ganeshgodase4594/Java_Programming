/*
 
Program 4:

WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2

  */
 

 /*import java.io.*;

class Assignment2{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int n=Integer.parseInt(br.readLine());

                int arr[]=new int[n];

		System.out.println("Enter the elements who want to search");

		int target=Integer.parseInt(br.readLine());

                System.out.println("Enter The Elements In Array");


                for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());

                }

		System.out.println("print the index of searchable element");

		for(int i=0;i<arr.length;i++){

			if(arr[i]==target){

				System.out.println(i);
			
			}

		}
	}
}

*/

// or
 import java.io.*;

class Assignment2{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int n=Integer.parseInt(br.readLine());

                int arr[]=new int[n];

                System.out.println("Enter the elements who want to search");

                int target=Integer.parseInt(br.readLine());

                System.out.println("Enter The Elements In Array");


                for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());

                }

                System.out.println("print the index of searchable element");

		int count =0;

                for(int i=0;i<arr.length;i++){

                        if(arr[i]==target){

                                count++;

				System.out.println(i);

                        }

                }

		if(count==0){

			System.out.println("Elements Is Not Found In Array!!!!");
		}
        }
}
