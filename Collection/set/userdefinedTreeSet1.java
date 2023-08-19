import java.util.*;

class Movies {

	String movieName = null;
	double totCollection = 0;
	float IMDB = 0.0f;

	Movies(String movieName, double totCollection, float IMDB) {

		this.movieName = movieName;
		this.totCollection = totCollection;
		this.IMDB = IMDB;
	}
	public String toString() {

		return " { "+movieName+" : "+totCollection+" : "+IMDB+" } ";
	}
}
class SortByName implements Comparator {

	public int compare(Object obj1, Object obj2) {

		return ((Movies)obj1).movieName.compareTo(((Movies)obj2).movieName);
	}
}
class SortByCollection implements Comparator {

	public int compare(Object obj1, Object obj2) {

		return (int)((((Movies)obj1).totCollection) - (((Movies)obj2).totCollection));
	}
}
class SortByIMDB implements Comparator {

	public int compare(Object obj1, Object obj2) {

		return (int)((((Movies)obj1).IMDB) - (((Movies)obj2).IMDB));
	}
}
class Client {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(new Movies("balak-palak",900.0,9.5f));
		al.add(new Movies("OMG 2",278.0,7.5f));
		al.add(new Movies("Gadar 2",489.0,8.1f));
		al.add(new Movies("mission_impossible",450.0,6.6f));

		System.out.println(al);
		
		System.out.println("Sorted By Movies Names");
		Collections.sort(al, new SortByName());
		System.out.println(al);
		
		System.out.println("Sorted By Movies Collection");
		Collections.sort(al, new SortByCollection());
		System.out.println(al);
		
		System.out.println("Sorted By Movies IMDB");
		Collections.sort(al, new SortByIMDB());
		System.out.println(al);
	}
}
