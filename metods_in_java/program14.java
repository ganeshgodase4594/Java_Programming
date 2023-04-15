class demo{


        void fun(float x){

                System.out.println("In fun");
                System.out.println(x);

        }

        public static void main(String[] args){

                demo obj=new demo();
                obj.fun(10);
                obj.fun(10.5f);
		obj.fun('A');
		obj.fun(10.5);
        }

}
