

import java.util.*;

class SortDemo{

        public static void main(String[] args){

                ArrayList ls=new ArrayList();

                ls.add("ganesh");
                ls.add("dhiraj");
                ls.add("aniket");
                ls.add("vishal");
                ls.add("supriya");

                System.out.println(ls);

		TreeSet hs=new TreeSet(ls);

		System.out.println(hs);
	}
}
