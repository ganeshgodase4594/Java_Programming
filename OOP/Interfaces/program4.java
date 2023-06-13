interface demo{

        void fun();
        void gun();
}

class child implements demo{

       public void fun(){

                System.out.println("in fun");
        }

        public void gun(){

                System.out.println("in gun");
        }

}

// no error
