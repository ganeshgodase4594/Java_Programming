
// methd in java

class MethodDemo{

	static void fun(){

		System.out.println("In Fun Method");
	}

	void gun(){

		System.out.println("In Gun Method");
	}

	public static void main(String[] args){

		
		gun();
		fun();

	}
}

// output-error
//
// we can acces only static method in static method
// we can not acces static method in static method
