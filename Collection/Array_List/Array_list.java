
import java.util.*;

class ArrayListDemo{

    public static void main(String[] args) {

        float ch = 'a';
        System.out.println(ch);
        
        ArrayList al=new ArrayList();

        // List al=new ArrayList();

        // add();

        al.add(10);
        al.add(20);
        al.add(20.5f);
        al.add(10);
        al.add("ganesh");
        al.add(20.5f);

        System.out.println(al);

        // int size();

        System.out.println(al.size());

        //  boolean contains(java.lang.Object);

        System.out.println(al.contains("ganesh"));
        System.out.println(al.contains("vishal"));


        // public int indexOf(java.lang.Object);

        System.out.println(al.indexOf(20.5f));

        // public int lastIndexOf(java.lang.Object);

        System.out.println(al.lastIndexOf(20.5f));

        // public E get(int);

        System.out.println(al.get(3));

        // public E set(int, E);

        al.set(4,"godase");

        System.out.println(al);

        // public void add(int, E);

        al.add(5, "prajwal");

        System.out.println(al);

        // E remove(int)

        System.out.println(al.remove(5));

        System.out.println(al);

        // addAll(Collection);

        ArrayList al2=new ArrayList();

        al2.add("rashmika");
        al2.add("Keerthy Suresh");
        al2.add("deepika padukon");

        al.addAll(al2);

        System.out.println(al);

        // public boolean addAll(int, java.util.Collection<? extends E>);

        al.add(2,al2);

        System.out.println(al);

        // public boolean remove(java.lang.Object);

        System.out.println(al.remove("ganesh"));

        // public java.lang.Object[] toArray();

        Object arr[]=al.toArray();

        for(Object data : arr){

            System.out.print(data + " ");
        }

        //  public void clear();

        al.clear();
        al2.clear();

        System.out.println(al);
        System.out.println(al2);















    }
}