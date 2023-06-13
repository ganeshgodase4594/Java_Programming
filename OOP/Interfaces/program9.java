
interface demo{
	
	void fun();
	void gun();
}

abstract class demochild implements demo{


	public void fun(){
		
		System.out.println("in fun");
	}

}

class demochild1 extends demochild{
	
	public void gun(){
		
		System.out.println("in gun");
	}
}

class client{
	
	public static void main(String[] args){
		
		demo obj=new demochild1();

		obj.fun();
		obj.gun();
	}
}

// in fun
// in gun
