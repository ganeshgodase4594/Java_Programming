// vvimp

class demo{
	
	void fun(Object obj){
		
		System.out.println("object");
	}

	void fun(String str){
		
		System.out.println("String");
	
	}
}

class client{
	
	public static void main(String[] args){
		
		demo obj=new demo();

		obj.fun("core2web");

		obj.fun(new StringBuffer("core2web"));

		obj.fun(null);
	}
}
