// recursive construction invokation

class demo{

        int x=10;

        demo(){

		this();

                Sysytem.out.println("in no-args constructor");
        }

        demo(int x){

                this();
                System.out.println("in para constructor");

        }

        public static void main(String[] args){

                demo obj=new demo(50);
        }
}

// error: recursive constructor invokation
