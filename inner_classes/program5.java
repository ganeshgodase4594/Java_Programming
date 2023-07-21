class outer{
	
	class inner{
		
		void m1(){
			
			System.out.println("in m1 inner");
		}
	}

	void m2(){
		
		System.out.println("in m2 outer");
	}

	public static void main(String[] args){
		
		inner obj=new inner();
		obj.m1();
	}
}

// error: non static class cannot be accessed in main ....


