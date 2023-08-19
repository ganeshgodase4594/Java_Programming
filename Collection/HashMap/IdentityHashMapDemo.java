// when we required duplicate key then we use identity hashmap..

import java.util.*;

class gana {
    public static void main(String[] args) {
        // Creating a new instance of IdentityHashMap
        IdentityHashMap hm = new IdentityHashMap();

        // Adding key-value pairs to the IdentityHashMap
        hm.put(new Integer(10), "ganseh");
        hm.put(new Integer(10), "vishal");
        hm.put(new Integer(10), "aniket");

        // Printing the IdentityHashMap
        System.out.println(hm);
    }
}

