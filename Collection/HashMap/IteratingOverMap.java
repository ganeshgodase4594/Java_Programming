
import java.util.*;

class IteratorOverMapDemo{

    public static void main(String[] args) {
        
        SortedMap sm=new TreeMap();

        sm.put("ind","india" );
        sm.put("pak", "pakistan");
        sm.put("aus", "austrilia");
        sm.put("ban", "bangladesh");
        sm.put("sl", "srilanka");

        System.out.println(sm);
        Set<Map.Entry> data=sm.entrySet();

        Iterator <Map.Entry>itr=data.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

            Map.Entry abc=itr.next();

            System.out.println(abc.getKey() + " : "+abc.getValue());
        }
    }
}

// output: Exception....NoSuchElementFoundException...