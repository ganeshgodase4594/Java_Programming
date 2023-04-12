/*
 Take input as user.Take users Dream company and package.
*/

import java.util.Scanner;

class DreamCompany{

	public static void main(String[] args){

		Scanner obj=new Scanner(System.in);

		System.out.println("Enter Your Dream Company Name");
		String Company_name=obj.next();

		System.out.println("Enter Your Dream Annual Package");
		float Package=obj.nextFloat();

		System.out.println("My Dream Company Is "+ Company_name);
		System.out.println("My Dream Annual Package Is "+ Package);
	}
}

 
