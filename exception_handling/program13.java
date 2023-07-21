// try...catch..finally

class demo{
	
	void m1(){
		

	}

	void m2(){
		

	}

	public static void main(String[] args){
		
		demo obj=new demo();

		obj.m1();

		obj=null;

		try{
			
			obj.m2();
		}catch(Throwable obj2){
		
			System.out.println("here");

		}finally{
			
			System.out.println("connection closed");
		}

		System.out.println("end main");
	}
}
