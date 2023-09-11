// create file in one folder if they existing..

import java.io.*;

class gitesh{

public static void main(String[] args)throws IOException{
	
	File obj=new File("prajwal");

	obj.mkdir();

	File obj2=new File(obj,"code1.txt");

	obj2.createNewFile();
	}
}
