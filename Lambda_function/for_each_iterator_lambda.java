// Lambda Function on for Each iterator...

import java.util.*;

class ArrayDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

        al.forEach(data -> System.out.println(data));
    }
}
