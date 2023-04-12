/* Take Input As User
 
StringTokenizer:

used to take input in single line:
>Dielimintor are used to break the output

 */

import java.io.*;
import java.util.*;

class StringTokenizerDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader( new InputStreamReader(System.in));

		System.out.println("Enter Society Name,Wing,Flat No");
		String info=br.readLine();

		System.out.println(info);

		StringTokenizer obj=new StringTokenizer(info," ");

		String Token1=obj.nextToken();
		String Token2=obj.nextToken();
		String Token3=obj.nextToken();

		System.out.println("Society= "+Token1);
		System.out.println("wing= "+Token2);
		System.out.println("Flat No= "+Token3);
	}
}
