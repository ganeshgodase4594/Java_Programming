// modifier in method overriding..

class parent{

         void fun(){

                System.out.println("parent fun");
        }
}

class child extends parent{

        final void fun(){

                System.out.println("child fun");
        }
}
