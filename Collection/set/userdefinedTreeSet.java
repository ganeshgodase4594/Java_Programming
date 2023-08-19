//  adding element using userdefined treeset..................

// comparable interface..

/*
import java.util.*;

class Movies implements Comparable{

        String MovieName=null;
        double TCollection=0.0f;

        float IMDB=0.0f;

        Movies(String MovieName,double TCollection,float IMDB){

                this.MovieName=MovieName;
                this.TCollection=TCollection;
                this.IMDB=IMDB;

        }


        public String toString(){

                return "{ " + MovieName + ": "+TCollection + ": " +IMDB+" }";
        }

        class SortByName implements Comparator<Movies> {

                public int compare(Movies obj1,Movies obj2){

                        return obj1.MovieName.compareTo(obj2.MovieName);
                }
        }

        class SortByCollection implements Comparator<Movies> {

                public int compare(Movies obj1,Movies obj2){

                        return (int) (obj1.TCollection-obj2.TCollection);
                }
        }

         class SortByIMDB implements Comparator<Movies> {

                public int compare(Movies obj1,Movies obj2){

                        return (int) (obj1.IMDB-obj2.IMDB);
                }
         }
}

class User{


        public static void main(String[] args){

        //      TreeSet ts=new TreeSet();

                ArrayList<Movies> al =new ArrayList<Movies>();

                al.add(new Movies("gadar2",145.00,5.5f));
                al.add(new Movies("OMG2",456.47,6.5f));
                al.add(new Movies("Jailer",1457.47,7.9f));
                al.add(new Movies("Subhedae",475.43,8.9f));

                System.out.println(al);

                System.out.println("sorted by movies name");

                Collections.sort(al,new SortByName());

                System.out.println(al);

                 System.out.println("sorted by Total Collection");

                Collections.sort(al,new SortByCollection());

                System.out.println(al);

                 System.out.println("sorted by IMDB Rating");

                Collections.sort(al,new SortByIMDB());

                System.out.println(al);
        }
}

*/

import java.util.*;

class Movies implements Comparable<Movies> {

    String MovieName = null;
    double TCollection = 0.0;
    float IMDB = 0.0f;

    Movies(String MovieName, double TCollection, float IMDB) {
        this.MovieName = MovieName;
        this.TCollection = TCollection;
        this.IMDB = IMDB;
    }

    @Override
    public String toString() {
        return "{ " + MovieName + ": " + TCollection + ": " + IMDB + " }";
    }

    static class SortByName implements Comparator<Movies> {
        public int compare(Movies obj1, Movies obj2) {
            return obj1.MovieName.compareTo(obj2.MovieName);
        }
    }

    static class SortByCollection implements Comparator<Movies> {
        public int compare(Movies obj1, Movies obj2) {
            return Double.compare(obj1.TCollection, obj2.TCollection);
        }
    }

    static class SortByIMDB implements Comparator<Movies> {
        public int compare(Movies obj1, Movies obj2) {
            return Float.compare(obj1.IMDB, obj2.IMDB);
        }
    }

    @Override
    public int compareTo(Movies other) {
        return this.MovieName.compareTo(other.MovieName);
    }
}

 class User {
    public static void main(String[] args) {
        ArrayList<Movies> al = new ArrayList<>();

        al.add(new Movies("gadar2", 145.00, 5.5f));
        al.add(new Movies("OMG2", 456.47, 6.5f));
        al.add(new Movies("Jailer", 1457.47, 7.9f));
        al.add(new Movies("Subhedae", 475.43, 8.9f));

        System.out.println(al);

        System.out.println("sorted by movie name");
        Collections.sort(al, new Movies.SortByName());
        System.out.println(al);

        System.out.println("sorted by total collection");
        Collections.sort(al, new Movies.SortByCollection());
        System.out.println(al);

        System.out.println("sorted by IMDB rating");
        Collections.sort(al, new Movies.SortByIMDB());
        System.out.println(al);
    }
}

