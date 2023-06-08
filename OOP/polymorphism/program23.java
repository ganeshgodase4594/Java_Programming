// access specifier in method overriding..

class parent{

        private void fun(){

                System.out.println("parent fun");
        }
}

class child extends parent{

        void fun(){

                System.out.println("child fun");
        }
}

class client{
	
	public static void main(String[] args){
		
		parent obj=new child();

		obj.fun();
	}
}

// error: private not access in child class...
