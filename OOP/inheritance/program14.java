// static in parent class

class parent{
	
	static{
		
		System.out.println("in parent static block");
	}
}

class child extends parent{
	
	static{
		
		System.out.println("in child static block");
	}
}

class client{
	
	public static void main(String[] args){
		
		child obj=new child();
	}
}

// in parent constructor
// in child constructor
//
// expalin: firstly static block run hoto...jari child la call kela tari child chya var parent class asto so parent class cha static block firstly run hoto.//...
