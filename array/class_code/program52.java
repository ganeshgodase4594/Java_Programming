class ArrayDemo{
	
	public static void main(String[] args){
		
		int arr2[][]={{1,2,3},{4,5},{6}};

		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				System.out.print(arr2[i][j]+" ");
			}

			System.out.println();
		}
	}
}

// Error: 1 2 3 
//        4 5 array index out of bounds
