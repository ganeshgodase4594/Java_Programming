class demo{
	
	void fun(int x){
		
		System.out.println(x);
	}

	void fun(float y){
		
		System.out.println(y);
	}

	void fun(demo obj){
		
		System.out.println("in demo para");
		System.out.println(obj);
	}

	public static void main(String[] args){
		
		demo obj= new demo();

		obj.fun(10);
		obj.fun(40.5f);
		demo obj1=new demo();

		obj1.fun(obj);
	}
}

// 10
// 40.5
// in demo para
// demo@344556
