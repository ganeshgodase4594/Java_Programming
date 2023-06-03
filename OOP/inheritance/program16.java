// parent and child che variable same astil tar apan parent che variable super.variable access karu shakto ani jar class cha object banvala asel tar apan ty//a class che variable consider karto..

class parent{
	
	int x=10;
	static int y=20;

	parent(){
		
		System.out.println("in parent");
	}

}

class child extends parent{
	
	int x=100;
	static int y=200;

	child(){
		
		System.out.println("in child");
	}

	void access(){
		
		System.out.println(super.x); // 10
		System.out.println(super.y); // 20
		System.out.println(x);       // 100
		System.out.println(y);       // 200
	}
}

class client{
	
	public static void main(String[] args){
		
		child obj=new child();
		obj.access();
	}
}
// in parent
// in child
// 10
// 20
// 100
// 200
