// real time example of abstract class..

abstract class country{
	
	String State_name="Maharashtra";

	country_info(){
		
		System.out.println("my country name is india");
	}

	abstract void state_info();
}

class state extends country{
	
	void state_info(){
		
		System.out.println("my state name is "+ State_name);
	}
}

class client{
	
	public static void main(String[] args){
		
		country state1=new state();

		state1.country_info();
		stae1.state_info();

	}
}
