//

class parent{
	
	static int x=10;

	static{
		
		System.out.println("in parent static");
	}

	static void access(){
		
		System.out.println(x);
	}
}

class child extends parent{
	
	static{
		
		System.out.println("in child static block");
		System.out.println(x);
		access();
	}
}

class client{
	
	public static void main(String[] args){
		
		child obj=new child();
	}
}
//in parent static
//in child static
//10
//10
