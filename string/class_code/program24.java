// bufferstring

class stringbufferdemo{
	
	public static void main(String[] args){
		
		StringBuffer str1=new StringBuffer("shashi");

		System.out.println(System.identityHashCode(str1));

		str1.append("bagal");

		System.out.println(str1); // shashibagal

		System.out.println(System.identityHashCode(str1));
	}
}
