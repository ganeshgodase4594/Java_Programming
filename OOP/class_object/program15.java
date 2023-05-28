// access specifier

class demo{
	
	int x=20;
	private int y=20;

	void fun(){
		
		System.out.println(x);
		System.out.println(y);
	}
}

class gana{
	
	public static void main(String[] args){
		
		demo obj=new demo();

		obj.fun();

		System.out.println(x); // error
		System.out.println(obj.y); // error
		System.out.println(obj.x); //no error
		System.out.println(y); //error
	}
}
