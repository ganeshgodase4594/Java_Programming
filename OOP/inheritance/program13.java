//

class parent{

        int x=10;

        parent(){

                System.out.println("in parent constructor");
        }

        void access(){

                System.out.println("parent instance");
        }
}

class child extends parent{

        int y=20;

        child(){

                System.out.println("in child constructor");
                System.out.println(x);
                System.out.println(y);

		public static void main(String[] args){
			
			child obj=new child();
		}
        }
}

// error: illegal start of expression
 
