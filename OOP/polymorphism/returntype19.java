class parent{

        Object fun(){

                Object obj=new Object();
                System.out.println("parent fun");
                return obj;
        }
}

class child extends parent{

        String fun(){

                System.out.println("child fun");

                return "ganesh";
        }
}

class client{

        public static void main(String[] args){

                parent p=new child();
                p.fun();
        }
}

// child fun..
// covarient class ...parent child relation
