
// solve the error of program1 and program2 using object of class

class xyz{

	static int x=28;
	int y=29;
	
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





