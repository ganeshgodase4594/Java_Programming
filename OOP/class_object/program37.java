class demo{

        int x=10;

        demo(){

		this();

                System.out.println("in no-args constructor");
        }

        demo(int x){

               
                System.out.println("in para constructor");

        }

        public static void main(String[] args){

                demo obj=new demo();
        }
}

//output: error:recursive construction invokation
