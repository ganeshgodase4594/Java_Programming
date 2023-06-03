// System.out.println()....

class System{
	
	static printstream out;
}

class printstream{
	
	void println(int x){
		

	}

	void println(float y){
		

	}

	void println(String str){
		

	}

	void println(object obj){
		

	}
}

class client{
	
	public static void main(String[] args){
		
		System.out.println("the core2 web");
	}
}

// println is the best example of method overloading...
// System ha class ahe to lang package madhye yeto..
// out ha printstrem class cha static finale object ahe..
// println yamdhye saglya method yetat..
// printstream ha io package yeto..
// but io package imported in systen class..
// and this attaches to our system..
// hence we access all method of printstrem class in system class...
