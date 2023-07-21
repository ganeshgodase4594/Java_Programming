class outer{
	
	object m1(){
		
		System.out.println("in m1 outer");
	}

	class inner{
		
		void m1(){
			
			System.out.println("in m1 inner");
		}

		return new inner();
	}

}

class client{
	
	public static void main(String[] args){
		
		outer obj=new outer();
		obj.m1().m1();
	}
}
