

// import java.util.*;

// class Platform implements Comparable{

//     String str=null;
//     int FoundYear=0;

//     Platform(String str,int FoundYear){

//         this.str=str;
//         this.FoundYear=FoundYear;
//     }

//     public String toString(){

//         return "{ "+str+" "+": "+FoundYear+ " } ";
//     }

//     public int compareTo(Object obj){

//         return this.FoundYear - ((Platform)obj).FoundYear;
//     }

//     class SortByName implements Comparator{

//         public int Compare(Object obj1,Object obj2){

//             return ((Platform)obj1).str.compareTo(((Platform)obj2).str);
//         }
//     }


// }

// class TreeMapDemo1{

//     public static void main(String[] args) {
        
//         TreeMap tm=new TreeMap();

//         tm.put(new Platform("YouTube", 2005),"Google");
//         tm.put(new Platform("Insta", 2013),"Meta");
//         tm.put(new Platform("FaceBook", 2004),"Meta");
//         tm.put(new Platform("ChatGpt", 2022),"OpenAI");

//         System.out.println(tm);
//     }
// }

import java.util.*;

class Platform1 implements Comparable<Platform1> {

    String str = null;
    int FoundYear = 0;

    Platform1(String str, int FoundYear) {
        this.str = str;
        this.FoundYear = FoundYear;
    }

    public String toString() {
        return "{ " + str + " " + ": " + FoundYear + " } ";
    }

    public int compareTo(Platform1 obj) {
        return this.FoundYear - obj.FoundYear;
    }

    static class SortByName implements Comparator<Platform1> {
        public int compare(Platform1 obj1, Platform1 obj2) {
            return obj1.str.compareTo(obj2.str);
        }
    }
}

class TreeMapDemo2 {

    public static void main(String[] args) {
        TreeMap<Platform1, String> tm = new TreeMap<>(new Platform1.SortByName());

        tm.put(new Platform1("YouTube", 2005), "Google");
        tm.put(new Platform1("Insta", 2013), "Meta");
        tm.put(new Platform1("FaceBook", 2004), "Meta");
        tm.put(new Platform1("ChatGpt", 2022), "OpenAI");

        System.out.println(tm);
    }
}
