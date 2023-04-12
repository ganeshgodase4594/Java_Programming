/*
 take input using scanner class
 */

import java.util.Scanner;

class ScannerDemo{

	public static void main(String[] args){

		Scanner obj=new Scanner(System.in);

		String name=obj.next();

		System.out.println("My Name " + name);

	}
}
