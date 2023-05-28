
// static block

class demo{
	
	int x=10;
	static int y=20;

	static{
		
		System.out.println("static block1");
	}

	public static void main(String[] args){
		
		System.out.println("Main Method");

		demo obj=new demo();

		System.out.println(obj.x);
	}

	static{
		
		System.out.println("Static Block 2");

		System.out.println(y);
	}

}
