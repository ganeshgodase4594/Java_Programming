// Method 4: compareTo();

class compareTo{
	
	public static void main(String[] args){
		
		String str1="ganesh";
		String str2="ganesh";


		System.out.println(str1.compareTo(str2));

		String str3="godase";
		String str4="Godase";

		System.out.println(str3.compareTo(str4));

		String str5="ganeshgodase";
		String str6="Ganesh";

		System.out.println(str5.compareTo(str6));

	}
}

// if string are equal then it return =0;
// if string are not equal then it return=difference;
// first element compare and then length calculate
