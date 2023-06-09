class parent{

        void career(){

                System.out.println("career");

        }

         abstract void marry();
}

class client{
	
	public static void main(String[] args){
		
		parent obj=new parent();
	}
}

// error: parent class is not abstract..cannot be inititated...
