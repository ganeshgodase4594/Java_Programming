
import java.util.*;

class Platform implements Comparable{

    String str=null;
    int FoundYear=0;

    Platform(String str,int FoundYear){

        this.str=str;
        this.FoundYear=FoundYear;
    }

    public String toString(){

        return "{ "+str+" "+": "+FoundYear+ " } ";
    }

    public int compareTo(Object obj){

        return this.FoundYear - ((Platform)obj).FoundYear;
    }

}

class TreeMapDemo1{

    public static void main(String[] args) {
        
        TreeMap tm=new TreeMap();

        tm.put(new Platform("YouTube", 2005),"Google");
        tm.put(new Platform("Insta", 2013),"Meta");
        tm.put(new Platform("FaceBook", 2004),"Meta");
        tm.put(new Platform("ChatGpt", 2022),"OpenAI");

        System.out.println(tm);
    }
}