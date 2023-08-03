/*
 1. Program 1:
Write a program to create an array of 5 integer elements.
And print all 5 elements from an array (take hardcoded values in the array)
Output :
1
2
3
4
5

*/

class practice{

	void practice(int arr[]){
	
		for(int i=0;i<5;i++){
			
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args){
		
		practice obj=new practice();

			int arr[]={1,2,3,4,5};

			obj.practice(arr);
		}
	}
	

