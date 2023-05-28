class macd{
	
	int items=5;

	String product="frice";

	void menu(){
		
		String menu1="veg";
		String menu2="nonveg";

		System.out.println(items);
		System.out.println(product);
	}
}

class display{
	
	public static void main(String[] args){
		
		macd obj=new macd();

		obj.menu();
	}
}
