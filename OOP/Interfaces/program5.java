interface demo{

        void fun();
        void gun();
}

class child implements demo{

        public void fun(){

                System.out.println("in fun");
        }

}

// error: class child not abstarct
