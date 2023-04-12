/* Take Input As User
 close();

 stream closed;

 br1 close the connection of all object/class.

 */

import java.io.*;

class IODemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br1=new BufferedReader( new InputStreamReader(System.in));
                BufferedReader br2=new BufferedReader( new InputStreamReader(System.in));

                String str1=br1.readLine();

                System.out.println("String1= "+str1);
		br1.close();

                String str2=br2.readLine();

                System.out.println("String2= "+str2);
        }
}

