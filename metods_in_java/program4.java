class xyz{

        static int x=28;
        static int y=29;

       static void fun(){

             System.out.println("in fun");
       }

       void gun(){

               System.out.println("in gun");
       }

       public static void main(String[] args){

               xyz obj=new xyz();

               fun();
               obj.gun();

               System.out.println(x);

               System.out.println(obj.y);
       }
}

