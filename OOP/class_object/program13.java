// access specifier

class demo{
	

	int noofcourse=8;
	private String favcourse="java";

	void display(){
		
		System.out.println(noofcourse);
		System.out.println(favcourse);
	}
}

class student{
	
	public static void main(String[] args){
		
		demo obj=new demo();

		obj.display();

		System.out.println(obj.noofcourse);
		System.out.println(obj.favcourse);
	}
}

// error: favcourse has private access in core2web
