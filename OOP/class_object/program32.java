class demo{
	
	demo(){
		
		System.out.println("no argument");
	}

	demo(int x){
		
		System.out.println("para");

	
	}

	demo(demo xyz){
		
		System.out.println("para demo");
	}

	public static void main(String[] args){
		
		demo obj1=new demo();
		demo obj2=new demo(10);
		demo obj3=new demo(obj1);
	}
}
