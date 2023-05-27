class StringDemo{
	
	public static void main(String[] args){
		
		String str1="Ganesh";
		String str2="Godase";

		System.out.println(str1);
		System.out.println(str2);

		str1.concat(str2);// only object banala tyla konich refrence nahi ahe.
		
		System.out.println(str1);
		System.out.println(str2);

	}
}
