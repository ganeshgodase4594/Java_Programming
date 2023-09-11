//
// methods in file class..

import java.io.*;

class Filemethod{
	
	public static void main(String[] args)throws IOException{
		
		File obj=new File("rahul.txt");

		obj.createNewFile();

		System.out.println(obj.getName());

		System.out.println(obj.getParent());

		System.out.println(obj.getPath());

		System.out.println(obj.getAbsolutePath());

		System.out.println(obj.canRead());

		System.out.println(obj.canWrite());

		System.out.println(obj.isDirectory());

		System.out.println(obj.isFile());

		System.out.println(obj.isHidden());


	}
}
