class StringDemo{
	
	public static void main(String[] args){
		
		String str1="GANESH";
		String str2="GODASE";
		
		System.out.println(str1+str2);

		String str3="GANESHGODASE";

		String str4=str1+str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	}
}
