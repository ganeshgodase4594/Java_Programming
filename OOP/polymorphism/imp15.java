class demo{
	
	void fun(int x,float y){
		
		System.out.println("int-float para");
	}

	void fun(float x,int y){
		
		System.out.println("float-int para");
	}
}

class client{
	
	public static void main(String[] args){
		
		demo obj=new demo();
		obj.fun(10,10);
	}
}

// error: ambigius to fun method..
// float and int can take 10 10 values so confusion is create.. 
