class employee{
	
	int empid=10;
	String name="ganesh";
	static int y=50;

	void empinfo(){
		
		System.out.println("id = "+empid);
		System.out.println("name= "+name);
		System.out.println("y= "+y);



	}
}

class vishal{
	
	public static void main(String[] args){
		
		employee emp1=new employee();
		employee emp2=new employee();

		emp1.empinfo();
		emp2.empinfo();

		System.out.println("-------------------------------------");

		emp2.empid=20;
		emp2.name="rahul";
		emp2.y=5000;

		emp1.empinfo();
		emp2.empinfo();
	}
}
