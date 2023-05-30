class demo{

        int x=10;

        demo(){

		this(50);

                System.out.println("in no-args constructor");
        }

        demo(int x){

                System.out.println("in para constructor");

        }

        public static void main(String[] args){

                demo obj=new demo();
        }
}

// output: in para constructor
//  in no-args constructor

// explain: this(50) ha demo(int x) la jato ani nantar demo madhhye excute hoto...
