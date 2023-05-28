class core2web{
	
	int noofcourse=10;
	String favcourse="IT";

	void display(){
		
		System.out.println(noofcourse);
		System.out.println(favcourse);
	}
}

class user{
	
	public static void main(String[] args){
		
		core2web obj=new core2web();
		obj.display();
	}
}
