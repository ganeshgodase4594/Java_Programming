// change the instance variable name using this

class player{
	
	private int jerno=0;
	private String pname=null;

	player(int jerno,String pname){
		
		this.jerno=jerno;
		this.pname=pname;

		System.out.println("in constructor");
	}

	void info(){
		
		System.out.println(jerno + " = "+pname);
	}
}

class client{
	
	public static void main(String[] args){
		
		player obj1=new player(18,"virat"); //player(obj1,18,"virat")
		obj1.info();

		player obj2=new player(7,"MSD");   //player(obj2,7,"MSD")
		obj2.info();

		player obj3=new player(45,"hitman"); //player(obj3,45,"hitman")
		obj3.info();
	}
}
