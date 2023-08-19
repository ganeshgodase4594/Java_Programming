
import java.util.*;

class CursorDemo{
	
	public static void main(String[] args){
		
		ArrayList al=new ArrayList();

		al.add(10);
		al.add(20.5);
		al.add(30.5f);
		al.add("ganesh");

		for(var x:al){
			
			System.out.println(x.getClass().getName());
		}
	}
}
