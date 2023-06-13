interface demo{
	
	void fun();
	void gun();
}

class child implements demo{
	
	void fun(){
		
		System.out.println("in fun");
	}

	void gun(){
		
		System.out.println("in gun");
	}
	
}

// error: attempting to assign weaker privillige , was public  
// beacause in parent method by default access specifier is public default and in child class access specifier is default...
