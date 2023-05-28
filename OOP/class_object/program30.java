// constructor

class demo{
	
	int x=10;

	demo(){
		
		System.out.println("in constructor");
	}

	void fun(){
		
		System.out.println(x);
	}

	public static void main(String[] args){
		
		demo obj=new demo();

		obj.fun();
	}
}

// in constructor
// 10
