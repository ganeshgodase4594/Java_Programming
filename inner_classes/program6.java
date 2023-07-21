class outer{

        class inner{

                void m1(){

                        System.out.println("in m1 inner");
                }
        }

        void m2(){

                System.out.println("in m2 outer");
        }

        public static void main(String[] args){

                inner obj=new outer().new inner();
                obj.m1();

		outer obj1=new outer();
		obj1.m2();

        }
}

// class madhye aslyalmule refrence chi garaj padat nahi....
