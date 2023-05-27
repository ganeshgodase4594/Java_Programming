// method 7

class equalsignorecase{
	
	public static void main(String[] args){
		
		String str1="ganesh";
		String str2="ganesh";
		String str3="godase";
		String str4="GoDase";
		String str5="nanaware";

		System.out.println(str1.equalsIgnoreCase(str2)); // true
		System.out.println(str1.equalsIgnoreCase(str3)); // false
		System.out.println(str1.equalsIgnoreCase(str4)); // false
		System.out.println(str1.equalsIgnoreCase(str5)); // flase
		System.out.println(str3.equalsIgnoreCase(str4)); // true

	}
}

// eualsIgnoreCase madhe apan jar string eual asel tar string chi case(uppercase and lowercase ) consider karat nahi
