abstract class parent{

         void career(){

                System.out.println("career");

        }

         abstract void marry();
}

class child extends parent{

        void marry(){

                System.out.println("Ileana D'Cruz");
        }
}

class client{

        public static void main(String[] args){

                parent obj=new child();

                obj.marry();
                obj.career();
        }
}

// no error: 
