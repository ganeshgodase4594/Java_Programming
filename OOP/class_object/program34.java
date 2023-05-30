// hidden this parameter

class demo{
	
	int x=10;

	demo(){  //demo(demo this)
		
		System.out.println("in no args constructor");
	}  

	demo(int x){   // demo(demo this,int x)
		
		System.out.println("in para constructor");
	}

	public static void main(String[] args){
		
		demo obj1=new demo(); //demo(obj1)
		demo obj2=new demo(10); //demo(obj2)
	}
}

// in no args constructor
// in para constructor
