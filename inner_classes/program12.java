// anonymous inner class..

class demo{

	int x=10;

	void marry(){
		
		System.out.println("deepika padukon");
	}
}

class client{
	
	public static void main(String[] args){
		
		demo obj=new demo(){
			
			void marry(){
				
				System.out.println("kirti suresh");
			}
		};

		obj.marry();
	}
}
