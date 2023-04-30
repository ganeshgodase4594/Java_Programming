//command line argument

class demo{

	public static void main(String[] args){

		int arr[]={10,20,30,40,50};

		String friends[]={"Dhiraj","Vishal","Aniket","Manish","Aditya"};

		for(int i=0;i<arr.length;i++){
			
			//System.out.println(friends[i]);

			System.out.println(args[i]);
		}
	}
}

// error: Array Index Outof Bound
