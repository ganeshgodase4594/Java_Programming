
// new type..

import java.util.*;

class HashSetDemoNew {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add(10);
        hs.add(20);

        hs.add(new Integer(10));
        hs.add(new Integer(20));

        System.out.println(hs);

	HashSet gg=new HashSet();

	gg.add("ganesh");
	gg.add("dhiraj");
	gg.add("aniket");
	gg.add("vishal");

	System.out.println(gg);

	HashSet vv=new HashSet();

	vv.add("adity");
	vv.add("supriya");
	vv.add("manish");
	vv.add("supriya");

	System.out.println(vv);
    }
}

