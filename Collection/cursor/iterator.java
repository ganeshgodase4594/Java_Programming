// iterator...universal iterrator..

import java.util.*;

class IteratorDemo{
	
	public static void main(String[] args){
		
		ArrayList al=new ArrayList();

		al.add("ritesh");
		al.add("prajwal");
		al.add("aniket");

		Iterator itr=al.iterator();

		while(itr.hasNext()){
			
			if("prajwal".equals(itr.next()));
				itr.remove();

				System.out.println(itr.next());
		}

		System.out.println(al);
	}
}
