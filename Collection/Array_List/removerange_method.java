import java.util.*;

class ArrayListDemo1 extends ArrayList{

    public static void main(String[] args) {
        
        ArrayListDemo1 al=new ArrayListDemo1();

        int num=1;

        for(int i=0;i<10;i++){

            al.add(num+10);
            num++;
        }

        System.out.println(al);

        al.removeRange(5, 8);

        System.out.println(al);
    }

    
}