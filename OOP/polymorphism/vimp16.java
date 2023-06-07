class demo{
	
	void fun(String str){
		
		System.out.println("String");
	}

	void fun(StringBuffer str1){
		
		System.out.println("StringBuffer");
	}
}

class client{
	
	public static void main(String[] args){
		
		demo obj=new demo();

		obj.fun("core2web"); //string
		
	        obj.fun(new StringBuffer("core2web")); // StringBuffer
		
		obj.fun(null); // error : ambiguity ..string la janar ki stringbuffer la janar yat confusion hote....so error...	
	}
}
