// add two numbers
import java.util.*;
class Add{

	static void add(int a,int b){

		int ans=a+b;

		System.out.println(ans);
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Value of a and b");

		int a=sc.nextInt();
		int b=sc.nextInt();

		add(a,b);
	}

	
}


