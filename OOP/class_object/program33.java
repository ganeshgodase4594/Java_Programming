// method signature

class demo{
	
	int x=10;

	demo(){
		
		System.out.println("in constructor");
		System.out.println(x);
	}

	demo(){
		
		System.out.println("in constructor 2");
		System.out.println(x);
	}
}

//error:constructor demo() is already define in class demo..
