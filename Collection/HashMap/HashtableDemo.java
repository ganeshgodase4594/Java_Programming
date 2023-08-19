
import java.util.*;

class HashtableDemo1{

    public static void main(String[] args) {
        
        Hashtable ht=new Hashtable();

        ht.put(10, "Sachin");
        ht.put(7,"MSD");
        ht.put(18,"Virat");
        ht.put(1,"KL Rahul");
        ht.put(45,"Rohit");

        System.out.println(ht);
    }
}

// output will be print according to hashcode
// Bucket Divided By 11
// Top to Bottom and rigth to left..