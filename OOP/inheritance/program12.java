//

class parent{
	
	int x=10;

	parent(){
		
		System.out.println("in parent constructor");
	}

	void access(){
		
		System.out.println("parent instance");
	}
}

class child extends parent{
	
	int y=20;

	child(){
		
		System.out.println("in child constructor");
		System.out.println(x);
		System.out.println(y);
	}
}

class client{
	
	public static void main(String[] args){
		
		child obj=new child();
		obj.access();
	}
}

// output:
// in parent constructor
// in child constructor
// 10
// 20
// parent instance
//
// explanation: child class madhye first line hi invokespecial aste (super) ti tyachya parent class first call karte..
