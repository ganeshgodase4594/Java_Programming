// passing array


class demo{

	static void fun(int arr[]){
		
		for(int x:arr){
			
			System.out.println(x);
		}
	}

public static void main(String[] args){
	
	int arr[]={10,20,30};

		for(int x:arr){

			System.out.println(x);
		}


		fun(arr);
	}
}


