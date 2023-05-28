class statdemo{
	
	static int x=10;
	static int y=20;

	static void disp(){
		
		System.out.println(x);
		System.out.println(y);
	}
}

class clients{
	
	public static void main(String[] args){
		
		System.out.println(statdemo.x);
		System.out.println(statdemo.y);

		statdemo.disp();
	}
}
