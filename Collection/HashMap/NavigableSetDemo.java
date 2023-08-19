
import java.beans.IndexedPropertyDescriptor;
import java.util.*;

class NavigableSetMethodDemo{

    public static void main(String[] args) {
        
        NavigableSet ns=new TreeSet();

        ns.add(10);
        ns.add(30);
        ns.add(14);
        ns.add(21);
        ns.add(23);

        System.out.println(ns);

        // lower(<)

        System.out.println(ns.lower(23));
        System.out.println(ns.lower(25));
        System.out.println(ns.lower(9));

        // ceilin(>=)

        System.out.println(ns.ceiling(23));
        System.out.println(ns.ceiling(25));

        // floor(<=)

        System.out.println(ns.floor(23));

        // higher(>)

        System.out.println(ns.higher(27));

        // PollFirst

        System.out.println(ns.pollFirst());

        // PollLast

        System.out.println(ns.pollLast());

        System.out.println(ns);

        // DescendingSet
        
        System.out.println(ns.descendingIterator());

        // Iterator

        Iterator itr=ns.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

        }

        //IteratorDescending

        Iterator itr1=ns.iterator();

        while(itr1.hasNext()){

            System.out.println(itr1.next());
        }

        //DesendingSet

        System.out.println(ns.descendingSet());

        //SubSet

        System.out.println(ns.subSet(10, true, 27, false));
        

    }

}