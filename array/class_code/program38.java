class ArrayDemo{

	static void fun(int arr[]){
		
		System.out.println("After Accesing The Adress Of Array");

		for(int x:arr){

			
			System.out.println(x);
		}

		for(int i=0;i<arr.length;i++){

			arr[i]=arr[i]+50;
		}
	}

	public static void main(String[] args){

		int arr[]={10,20,30,40,50};

		fun(arr);

		for(int x:arr){
		
		System.out.println(x);
		}
	}
}
