// access specifier in method overriding..
// private..

class parent{

        private void fun(){

                System.out.println("parent fun");
        }
}

class child extends parent{

        void fun(){

                System.out.println("child fun");
        }
}

// no error...
