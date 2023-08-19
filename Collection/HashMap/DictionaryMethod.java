
import java.util.*;

class DictionaryMathodDemo{

    public static void main(String[] args) {
        
        Dictionary ht=new Hashtable();

        ht.put(10, "Sachin");
        ht.put(7,"MSD");
        ht.put(18,"Virat");
        ht.put(1,"KL Rahul");
        ht.put(45,"Rohit");

        System.out.println(ht);

        // keys

        Enumeration itr1=ht.keys();

        while(itr1.hasMoreElements()){

            System.out.println(itr1.nextElement());
        }

        Enumeration itr2=ht.elements();

        while(itr2.hasMoreElements()){

            System.out.println(itr2.nextElement());
        }

        System.out.println(ht.get(10));

        ht.remove(1);

        System.out.println(ht);
    }
}
