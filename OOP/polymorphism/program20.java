// access specifier in method overriding..

class parent{
	
	public void fun(){
		
		System.out.println("parent fun");
	}
}

class child extends parent{
	
	void fun(){
		
		System.out.println("child fun");
	}
}

// error: compilele time..
//  attempting to assign weaker access privileges; was public
