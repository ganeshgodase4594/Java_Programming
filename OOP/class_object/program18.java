// static and non static change

class demo{
	
	int x=10;

	private int y=20;

	static int z=30;

	void disp(){
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

class client{
	
	public static void main(String[] args){
		
		demo obj1=new demo();
		demo obj2=new demo();

		obj1.disp();

		obj1.x=100;
		obj2.z=300;

		obj1.disp();
		obj2.disp();
	}
}
// 10
// 20
// 30
// 100
// 20
// 300
// 10
// 20
// 300

