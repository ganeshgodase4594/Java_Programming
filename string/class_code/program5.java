class StringDemo{
	
	public static void main(String[] args){
		
		int arr1[]={10,100,200};
		int arr2[]={10,100,200};

		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));
		System.out.println(System.identityHashCode(arr2[0]));
		System.out.println(System.identityHashCode(arr2[1]));
		System.out.println(System.identityHashCode(arr2[2]));
		System.out.println(System.identityHashCode(arr2[0]));
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));

	}
}

// integer cache range is between -127 to +127 so 200 will not be go on integer cache
