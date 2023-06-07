class parent{

      	String fun(){
		
		System.out.println("child fun");

		return "ganesh";
	}
}

class child extends parent{

	
        Object fun(){

                Object obj=new Object();
                System.out.println("parent fun");
                return obj;
        }
}

class client{

        public static void main(String[] args){

                parent p=new child();
                p.fun();
        }
}

// error  ; no covarient class..
// fun() in child cannot override fun() in parent
        //Object fun(){
               ^
  //return type Object is not compatible with String
