// treeset...
//
// give unique data in sorted order...

import java.util.*;

class TreeSetDemo{
	
	public static void main(String[] args){
		
		TreeSet ts=new TreeSet();

		ts.add("ganesh");
		ts.add("vishal");
		ts.add("dhiraj");
		ts.add("manish");
		ts.add("aditya");
		ts.add("aniket");

		System.out.println(ts);

		TreeSet gh=new TreeSet();

		gh.add(10);
		gh.add(50);
		gh.add(30);
		gh.add(40);
		gh.add(20);

		System.out.println(gh);
	}
}
