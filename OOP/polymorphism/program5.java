// method overriding

class parent{
	
	parent(){
		
		System.out.println("in parent constructor");
	}

	void property(){
		
		System.out.println("home,gold,car");
	}

	void marry(){
		
		System.out.println("alia bhatt");
	}
}

class child extends parent{
	
	child(){
		
		System.out.println("in child constructor");
	}

	void marry(){
		
		System.out.println("rashmika mandhana");
	}
}

class client{
	
	public static void main(String[] args){
		
		child obj=new child();
		obj.property();
		obj.marry();
	}
}

// in parent constructor
// in child constructor
// home,gold,car
// rashmika mandhana
// method override hoto child class chi..
