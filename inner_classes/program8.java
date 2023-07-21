// static nested or static inner class...

class outer{
	
	void m1(){
		
		System.out.println("in m1 outer");
	}

	static class inner{
		
		void m1(){
			
			System.out.println("in m1 inner");
		}
	}

	public static void main(String[] args){
		
		inner obj=new inner();
		obj.m1();

		outer obj1=new outer();
		obj1.m1();
	}
}
