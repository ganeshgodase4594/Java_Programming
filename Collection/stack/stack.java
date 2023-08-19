// stack...
//

import java.util.*;

class stackdemo{
	
	public static void main(String[] args){
		
		Stack s=new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s);

		System.out.println(s.peek());

		s.pop();

		s.pop();

		System.out.println(s.pop());

		System.out.println(s);

		System.out.println(s.isEmpty());

		s.pop();

		System.out.println(s.isEmpty());
	}
}
