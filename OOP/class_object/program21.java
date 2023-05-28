class ganesh{
	
	int x=10;

	static int y=20;

	void fun1(){
		
		System.out.println(x);
		System.out.println(y);
	}

	static void fun(){
		
		System.out.println(y);
	}
}

class dhiraj{
	
	public static void main(String[] args){
		
		ganesh obj=new ganesh();

		obj.fun1();

		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
