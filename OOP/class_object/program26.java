// java support global variable

class vaibhav{
	
	static int x=10;

	static{
		
		static int y=20; // error: illegal start of expression
	}

	void fun(){
		
		static int z=20;
	}

	static void gun(){
		
		static int z=20;
	}

	public static void main(String[] args){
		
		vaibhav obj=new vaibhav();

		obj.fun();
	}
}
