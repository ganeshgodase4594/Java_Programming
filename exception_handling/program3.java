// default exception handler...arithmetic exception..

class demo{
	
	void m1(){
		
		System.out.println("in m1");
		System.out.println(10/0);
		m2();
	}

	void m2(){
		
		System.out.println("in m2");

	}

	public static void main(String[] args){
	
		System.out.println("start main");

		demo obj=new demo();
		obj.m1();

		System.out.println("end main");
	}
}

//error ; arithmetic exception..
