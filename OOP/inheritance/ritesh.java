// first code of inheritance

class ICC{
	
	ICC(){
		
		System.out.println("in icc constructor");
	}
}

	class BCCI extends ICC{
		
		BCCI(){
			
			System.out.println("in bcci constructor");
		}
	}


class client{
	
	public static void main(String[] args){
		
		BCCI obj=new BCCI();
	}
}

// output:in icc constructor
//        in bcci constructor

// explain: because in bcci() first line is invokespecial then it call first its parent class which is ICC()...

/*
 
   class client {
  client();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #7                  // class BCCI
       3: dup
       4: invokespecial #9                  // Method BCCI."<init>":()V
       7: astore_1
       8: return
}

*/
