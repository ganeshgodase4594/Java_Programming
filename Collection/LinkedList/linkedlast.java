

// linked list...

import java.util.*;

class LinkedListDemo{
	
	public static void main(String[] args){
		
		LinkedList ll=new LinkedList();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);

		System.out.println(ll);

		ll.addFirst(5);

		ll.addLast(50);

		System.out.println(ll);

		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);

		System.out.println(ll.getFirst());

		System.out.println(ll.getLast());

	  	System.out.println(ll);	
	}
}
