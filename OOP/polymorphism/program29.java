// static modifier in method overriding..

class parent{

         void fun(){

                System.out.println("parent fun");
        }
}

class child extends parent{

        static void fun(){

                System.out.println("child fun");
        }
}

// error  : overriding method is static
