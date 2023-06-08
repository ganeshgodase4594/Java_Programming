// static modifier in method overriding..

class parent{

        static void fun(){

                System.out.println("parent fun");
        }
}

class child extends parent{

        static void fun(){

                System.out.println("child fun");
        }
}

class client{
	
	public static void main(String[] args){
		
		parent obj=new parent();

		obj.fun();

		child obj1=new child();

		obj1.fun();

		parent obj2=new child();

		obj2.fun();
	}
}

// outpur:
// parent fun
// child fun
// parent fun
