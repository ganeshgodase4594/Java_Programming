// class and object

class OOP{

	int x=10;

	static int y=20;

	void fun(){
		
		int x=30;
		
		System.out.println(x);

		System.out.println(y);
	}
	
	public static void main(String[] args){
		
		OOP obj=new OOP();

		obj.fun();
	}
}
