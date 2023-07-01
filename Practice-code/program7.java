/*
 
   1 2 3 4 
   5 6 7
   8 9

 */

class practice{
	
	public static void main(String[] args){
		
		int num=1;
		int row=3;

		for(int i=0;i<row;i++){
			
			for(int j=0;j<row-i+1;j++){
				
				System.out.print(num+" ");

				num++;
			}

			System.out.println("");
		}
	}
}
