// static inner class..

class outer{
	
	static class inner{
		
		void m1(){
			
			System.out.println("in m1");
		}
	}
}

class client{
	
	public static void main(String[] args){
		
		outer.inner obj=new outer.inner();
		obj.m1();
	}
}
