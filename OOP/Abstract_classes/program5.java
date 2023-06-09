abstract class parent{

        abstract void career(){

                System.out.println("career");

        }

         abstract void marry();
}

class client{

        public static void main(String[] args){

                parent obj=new parent();
        }
}

//program5.java:3: error: abstract methods cannot have a body
    //    abstract void career(){
      //                ^
//program5.java:16: error: parent is abstract; cannot be instantiated
  //              parent obj=new parent();
