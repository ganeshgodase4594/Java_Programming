// hidden this refrence

class demo{
	
	int x=10;

	demo(){    //demo(demo this)
		
		System.out.println("in constructor");
		System.out.println(this);
		System.out.println(this.x);
	}

	void fun(){  //fun(demo this)
		
		System.out.println(this);
		System.out.println(x);
	}

	public static void main(String[] args){
		
		demo obj=new demo();  //demo(obj)

		System.out.println(obj);
		obj.fun();       //fun(obj)
	}
}
