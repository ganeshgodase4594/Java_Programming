// access specifier in method overriding..

class parent{

         void fun(){

                System.out.println("parent fun");
        }
}

class child extends parent{

        public void fun(){

                System.out.println("child fun");
        }
}

// parent method cha scope child chya method pekasha kami asel tar chalat nahi..
// output: no error
