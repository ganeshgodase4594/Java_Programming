class RCB{

	public static void main(String[] args){

		int arr1[]=new int[5];

		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50; //no error

		int arr2[]={10,20,30,40,50};//no error

		int arr3[]=new int[]{10,20,30,40,50};//no error

		int arr4[]=new int[5]{10,20,30,40,50};//error


	
	}



}

//output:error;
