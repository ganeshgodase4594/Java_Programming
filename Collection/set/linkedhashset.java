// LinkedHashSet

import java.util.*;

class LinkedHashSetDemo{
	
	public static void main(String[] args){
		
		LinkedHashSet hs=new LinkedHashSet();

		hs.add("kanha");
		hs.add("rahul");
		hs.add("ashish");
		hs.add("badhe");
		hs.add("rahul");
		hs.add("ashish");

		System.out.println(hs);
	}
}

// output: [kanha,rahul,ashish,badhe,]
//
// insertion order prserved...
