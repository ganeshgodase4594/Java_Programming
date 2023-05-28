class constrdemo{

	constrdemo(){
	
	System.out.println("In Constuctor");

	}

	void fun(){
		
		constrdemo obj=new constrdemo();
	}

	public static void main(String[] args){
		
		constrdemo obj1=new constrdemo();

		constrdemo obj2=new constrdemo();

		obj1.fun();
	}
}
