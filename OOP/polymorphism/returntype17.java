// rreturn type overriding
// method overriding madhye return type matter karto..

class parent{
	
	char fun(){
		
		System.out.println("parent fun");
		return 'A';
	}
}

class child extends parent{
	
	int fun(){
		
		System.out.println("child fun");

		return 10;
	}
}

class client{
	
	public static void main(String[] args){
		
		parent obj=new child();
		obj.fun();
	}
}

// error: same data type method overriding madhye chalat nahit..
