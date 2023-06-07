class parent{

        parent(){

                System.out.println("in parent constructor");
        }

        void fun(int x){

                System.out.println("in parent fun");
        }
}

class child extends parent{

        child(){

                System.out.println("in child constructor");
        }

        void fun(int x){

                System.out.println("in child fun");
        }
}

class client{

        public static void main(String[] args){

                parent obj=new child();
                obj.fun();
        }
}

/*
 
program11.java:32: error: method fun in class parent cannot be applied to given types;
                obj.fun();
                   ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length

 */

