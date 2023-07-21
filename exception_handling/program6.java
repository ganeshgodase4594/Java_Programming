// arithmetic exception using try and catch..

class demo{
	
	public static void main(String[] args){
		
		System.out.println("start main");

		try{
			
			System.out.println(10/0);	// risky code...


		}catch(ArithmeticException obj){
			
			System.out.println("exception occured");
		}

		System.out.println("End Main");

	}
}

// output:
// start main
// exception occured 
// end main
