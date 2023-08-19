// SortedSet Methods...

import java.util.*;

class SortedSetDemo{
	
	public static void main(String[] args){
		
		SortedSet ss=new TreeSet();

		ss.add("kanha");
		ss.add("rajesh");
		ss.add("rahul");
		ss.add("ashish");
		ss.add("badhe");

		System.out.println(ss);

		System.out.println(ss.headSet("kanha"));

		System.out.println(ss.tailSet("kanha"));

		System.out.println(ss.subSet("ashish","rahul"));

		System.out.println(ss.headSet("kanha"));

		System.out.println(ss.first());

		System.out.println(ss.last());
	}
}
