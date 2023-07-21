// inner class..

// type of inner class...

//1.normal inner class
//2.Method Local inner class
//3.Static Inner class(Static nested class)
//4.Annonymous Inner Class
//        -Normal
//        -parameterized anononymous Inner class


// 1.normal inner class

class Outer{
	
	class Inner{
		
		void m1(){
			
			System.out.println("In m1-inner");
		}
	}

	void m2(){
		
		System.out.println("in m2-outer");
	}
}

class client{
	
	public static void main(String[] args){
		
		Outer obj=new Outer();
		obj.m2();

		//Outer.Inner obj1 =obj.new Inner();
		//obj1.m1();
		             // or
		Outer.Inner obj1=new Outer().new Inner();
		obj1.m1();
	}
}
