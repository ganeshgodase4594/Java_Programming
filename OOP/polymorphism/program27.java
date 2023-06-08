// modifier in method overriding..

class parent{

        final void fun(){

                System.out.println("parent fun");
        }
}

class child extends parent{

        final void fun(){

                System.out.println("child fun");
        }
}

// error: overridden method is final..
