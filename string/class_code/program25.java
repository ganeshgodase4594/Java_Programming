// string capacity

// stirng buffer chi default capacity 16 character ahe ..

class stringBufferCapacity{
	
	public static void main(String[] args){
		
		StringBuffer str1=new StringBuffer();

		System.out.println(str1.capacity()); // 16

		StringBuffer str2=new StringBuffer("ganesh");

		System.out.println(str2.capacity()); // 22
	}
}
