// preference for static variable,static block,static method,instance variable,instance block,constructor,instance method

class demo{
	
	int x=10;

	static int y=20;

	demo(){
		
		System.out.println("in constructor");
	}

	static{
		
		System.out.println("in static block1");

	}

	{
	
		System.out.println("In Instance Block1");
	}

	public static void main(String[] args){
		
		demo obj=new demo();
	}

	static{
		
		System.out.println("in static block2");

	}

	{
		System.out.println("in instance block2");
	}
}
