abstract class parent{

        abstract void career(){

                System.out.println("career");

        }

         abstract void marry();
}

class child extends parent{
	
	void marry(){
		
		System.out.println("Ileana D'Cruz");
	}
}

class client{

        public static void main(String[] args){

                parent obj=new parent();
        }
}

// error: program6.java:3: error: abstract methods cannot have a body
  //      abstract void career(){
    //                  ^
//program6.java:12: error: child is not abstract and does not override abstract method career() in parent
//class child extends parent{
//^
//program6.java:24: error: parent is abstract; cannot be instantiated
 //               parent obj=new parent(); 
