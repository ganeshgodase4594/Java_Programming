
// 

class employee{
	
	int empid=10;
	String empname="vishal";

	void empinfo(){
		
		System.out.println("id = "+empid);
		System.out.println("empname= "+empname);
	}
}

class main{
	
	public static void main(String[] args){
		
		employee emp1=new employee();

		emp1.empinfo();

		System.out.println(emp1.empid);
		System.out.println(emp1.empname);
	}
}
