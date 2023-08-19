
import java.util.*;

class SortedMapMethodDemo1{

    public static void main(String[] args) {
        
        SortedMap sm=new TreeMap();

        sm.put("ind","india" );
        sm.put("pak", "pakistan");
        sm.put("aus", "austrilia");
        sm.put("ban", "bangladesh");
        sm.put("sl", "srilanka");

        System.out.println(sm.subMap("aus", "pak"));

        System.out.println(sm.headMap("pak"));

        System.out.println(sm.tailMap("pak"));

        System.out.println(sm.firstKey());

        System.out.println(sm.lastKey());

        System.out.println(sm.values());

        System.out.println(sm.entrySet());
    }
}