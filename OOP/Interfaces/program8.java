interface demo{

        void fun();
}

class child implements demo{

       public void fun(){

                System.out.println("in fun");
        }

        public void gun(){

                System.out.println("in gun");
        }

}

class client{

        public static void main(String[] args){

                demo obj=new child();

                obj.gun(); // error: parent chya refrence var call kartana ti method parent madhye aslich pahije

                obj.fun();
        }
}

// cannot find symbol..
