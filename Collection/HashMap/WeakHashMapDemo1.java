// WeakHashMap ...Used For Garbage Collector...
// Beacause HashMap Do Not Use Garbage Collector..

import java.util.*;

class aniket{

                String str=null;

                aniket(String str){

                        this.str=str;
                }

                public String toString(){

                        return str;
                }

                public void finalize(){

                        System.out.println("notify!!!!");
                }
}

class client1{

        public static void main(String[] args){

                aniket obj1=new aniket("core2web");
                aniket obj2=new aniket("biencaps");
                aniket obj3=new aniket("incubator");

		WeakHashMap hm=new WeakHashMap();

		hm.put(obj1,4515);
		hm.put(obj2,4587);
		hm.put(obj3,1452);

		obj1=null;

		System.gc();

                System.out.println(hm);
        }
}
