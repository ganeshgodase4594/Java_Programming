// real time example of inheritance...

class country{
	
	String country_name="india";
	String country_capital="delhi";

	void country_info(){
		
		System.out.println("my country name is = "+ country_name );
		System.out.println("my country capital name is = "+country_capital);
	}
}

class state extends country{
	
	String state_name="maharashtra";
	int population=113345654;

	void state_info(){
		
		System.out.println("my state name is "+state_name+ "and it is part of "+country_name );

		System.out.println(country_capital+" is the central capital of "+population + " people");
	}
}

class citizen{
	
	public static void main(String[] args){
		
		state citizen1=new state();

		citizen1.state_info();
		citizen1.country_info();
		

	}
}
