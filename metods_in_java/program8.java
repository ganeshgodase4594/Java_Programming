// check the no is palindrome or not using function:



import java.util.*;
class palindrome{

	static void palindrome(int num){

		int temp=num;

		int rev=0;

		while(num!=0){

			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;

		}

		System.out.println(rev);

		if(temp==rev){

			System.out.println(temp + " is a palindrome no");
		}
		else{

			System.out.println(temp+ " is a not palindrome");
		}
		

	}




	public static void main(String[] args){

		Scanner obj=new Scanner(System.in);

		System.out.println("Enter The Number");

		int num=obj.nextInt();

		palindrome(num);
	}
}
