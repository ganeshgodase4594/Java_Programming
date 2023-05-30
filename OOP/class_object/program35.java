class demo{

	int x=10;

	demo(){
		
		System.out.println("in no-args constructor");
	}

	demo(int x){
		
		this();
		System.out.println("in para constructor");

	}

	public static void main(String[] args){
		
		demo obj=new demo(50);
	}
}

// output:
// in no-args constructor
// in para constructor
//
// explain: this() line hi first line la aste constructor madhye...this() cha use karun apan aka constructor madhun dusarya constructor la call karu shakto....navin object banvanyachi garaj nahi...
