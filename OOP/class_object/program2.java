// real time example including static variable,instance variable,static method and non static method

class cricfantacy{
	
		
		String appname="dream11";
		
		int noofcontest=50;

		void creatingteam(){
			
			String team1="MI";
			String team2="RCB";

		System.out.println("11 players selected in " + team1 + " and " + team2 + " and join 5 out of  " + noofcontest + " contest on "+ appname );
		
		}
	}

class users{
	
	public static void main(String[] args){
		
		cricfantacy obj=new cricfantacy();

		obj.creatingteam();
	
	}
}
