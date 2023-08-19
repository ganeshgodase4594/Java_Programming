
import java.util.*;

class curserdemo{

        public static void main(String[] args){

                ArrayList al=new ArrayList();

                al.add("vishal");
                al.add("ganesh");
                al.add("dhiraj");

		ListIterator litr = al.listIterator();

		while(litr.hasNext()){
			
			System.out.println(litr.next());
		}

		while(litr.hasPrevious()){
			
			System.out.println(litr.previous());
		}
	}
}
