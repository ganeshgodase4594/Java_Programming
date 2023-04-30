// Jagged Array Initialization part II


class JaggedArray{
	
	public static void main(String[] args){
		
		// int arr[][]={{1,2,3},{4,5},{6}};

		int arr2[][]=new int[3][];

		arr2[0]=new int[]{1,2,3};
		arr2[1]=new int[]{4,5};
		arr2[2]=new int[]{6};

		for(int x[]:arr2){
			
			for(int y:x){

				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
