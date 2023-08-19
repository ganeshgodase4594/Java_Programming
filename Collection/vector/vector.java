// vector..

import java.util.*;

class vectorDemo1{
	
	public static void main(String[] args){
		
		Vector v=new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(v);

		System.out.println(v.capacity());

		System.out.println(v.size());

		v.clear();

		System.out.println(v);
	}
}
