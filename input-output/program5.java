/* Take Input As User 
 Enter Society Name;
 Enter Wing Name;
 Enter Flat No:

 */

import java.io.*;

class Society{

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));

		System.out.println("Enter Society Name");
		String Society_name=br.readLine();

		System.out.println("Enter Wing Name");
		char Wing_name=(char)br.read();
		br.skip(1);

		System.out.println("Enter flat No");
		int Flat_no=Integer.parseInt(br.readLine());

		System.out.println("Society Name "+ Society_name);
		System.out.println("wing Name "+Wing_name);
		System.out.println("Flat No "+Flat_no);
	}
}



