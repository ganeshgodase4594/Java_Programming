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
		StringTokenizer obj=new StringTokenizer(br.readLine());

                System.out.println("Enter mall_Name");
                String mall_name=br.readLine();

                System.out.println("Enter Mall no");
		int mall_no = Integer.parseInt(br.nextToken());

                StringTokenizer obj=new StringTokenizer(br.readLine());

		System.out.print("Enter a Mall Section Name");
                char mall_section_name= obj.nextToken().charAt(0);

		System.out.println("Enter Sugar Price In Mall");
		float sugar_price = Integer.parseFloat(br.nextToken());

		System.out.println(mall_name);
		System.out.println(mall_no);
	        System.out.println(mall_section_name);
	        System.out.println(sugar_price);




        }
}
