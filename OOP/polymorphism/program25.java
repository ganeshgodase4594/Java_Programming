// modifier in method overriding..

class parent{

        final void fun(){

                System.out.println("parent fun");
        }
}

class child extends parent{

        void fun(){

                System.out.println("child fun");
        }
}

// error: method overridden is final..
