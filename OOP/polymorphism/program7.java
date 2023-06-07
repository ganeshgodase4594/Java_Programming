// method overriding

class parent{

        parent(){

                System.out.println("in parent constructor");
        }

        void fun(){

                System.out.println("in fun");
        }
}

class child extends parent{

        child(){

                System.out.println("child constructor");
        }

        void gun(){

                System.out.println("in gun");
        }
}

class client{

        public static void main(String[] args){

                parent obj1=new child(); // done:
                obj1.fun();
                obj1.gun();

                child obj2=new parent(); // error: 
                obj2.fun();
                obj.gun();
        }
}

// error...incompitable type..
