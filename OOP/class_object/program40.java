// super() and this() line we not write first....at a time in code

class demo{

        int x=10;

        demo(){

                System.out.println("in no args constructor");
        }

        demo(int x){

                super();
		this();

                System.out.println("in para constructor");
        }

        public static void main(String[] args){

                demo obj=new demo(50);

        }
}

// program40.java:15: error: call to this must be first statement in constructor
               // this();
