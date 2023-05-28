// instance block

class demo{
	
	int x=10;

	demo(){
		
		System.out.println("in constructor");
	}

	{
		System.out.println("instance block1");
	}

	public static void main(String[] args){
		
		demo obj=new demo();

		System.out.println("in main");
	}

	{
		System.out.println("instance block2");

	}
}
