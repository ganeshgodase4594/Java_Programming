//parent child relationship

class parent{
	
	parent(){
		
		System.out.println("in parent constructor");
	}

	void parentproperty(){
		
		System.out.println("home,gold,land");
	}
}

class child extends parent{
	
	child(){
		
		System.out.println("in child constructor");
	}
}

class client{
	
	public static void main(String[] args){
		
		child obj2=new child();
		obj2.parentproperty();
	}
}

// output:
// in parent constructor
// in child constructor
// home,gold,land
