// real time example of method overriding...

class match{
	
	void matchtype(){
		
		System.out.println("T20/ODI/TEST");
	}
}

class iplmatch extends match{
	
	void matchtype(){
		
		System.out.println("T20");
	}
}

class testmatch extends match{
	
	void matchtype(){
		
		System.out.println("TEST");
	}
}

class cricinfo{
	
	public static void main(String[] args){
		
		match type1=new iplmatch();
		type1.matchtype();

		match type2=new testmatch();
		type2.matchtype();
	}
}
