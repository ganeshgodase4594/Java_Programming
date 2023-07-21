class demo{

        void m1(){

                System.out.println("in m1");
              
                
        }

        void m2(){

                System.out.println("in m2");

        }

        public static void main(String[] args){

                System.out.println("start main");

                demo obj=new demo();
                obj.m1();

		obj=null;

		obj.m2();

                System.out.println("end main");
        }
}

// output:
// start main
// in m1
// exception
