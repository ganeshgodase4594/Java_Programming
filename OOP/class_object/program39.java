// super() and this() line we not write first....at a time in code 

class demo{
		
	int x=10;

	demo(){
			
		System.out.println("in no args constructor");
	}

	demo(int x){
			
		this();
		super();

		System.out.println("in para constructor");
	}

	public static void main(String[] args){
		
		demo obj=new demo(50);

	}
}

// output: error: call to super must be first statement in constructor
                //super();
               //
//
//    explain : construcor madhaye apan first line apan nehami super() or this() aste but this() hi hidden aste ti bytecode madhye disat nahi
//
//    aktar lihatana apan super() kiva this() dohnipaiki akach lihato...






