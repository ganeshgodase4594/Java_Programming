
interface demo{

        void fun();
        void gun();
}

class child implements demo{

       public void fun(){

                System.out.println("in fun");
        }

        public void gun(){

                System.out.println("in gun");
        }

}

class client{
	
	public static void main(String[] args){
		
		demo obj=new child();

		obj.gun();

		obj.fun();
	}
}
