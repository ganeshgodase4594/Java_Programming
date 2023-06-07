// real time example of method overloading..

class ipl{
	
	void matchinfo(String team1,String team2){
		
		System.out.println(team1 +" vs "+team2);
	}

	void matchinfo(String team1,String team2,String matchvenue){
		
		System.out.println("match played between "+ team1 + " Vs " + team2 + "at the venue of " +matchvenue);
	}
}

	
class client{
	
	public static void main(String[] args){
		
		ipl ipl2023=new ipl();
		ipl2023.matchinfo("CSK","GT");
		ipl2023.matchinfo("CSK","GT","Ahamadabad");
	}
}
