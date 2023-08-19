
import java.util.*;

class curser{
	
	public static void main(String[] args){
		
		ArrayList al=new ArrayList();

		al.add("vishal");
		al.add("ganesh");
		al.add("dhiraj");

		Iterator cursor=al.iterator();

		while(cursor.hasNext()){
			
			if("vishal".equals(cursor.next())){
			
				cursor.remove();
			}
		}

		System.out.println(al);
	}
}
