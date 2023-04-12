/* Take Input As User
 Enter player Name;
 Enter player Age;
 Enter player Batting Average:

 */

import java.io.*;

class Player_info{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader( new InputStreamReader(System.in));

                System.out.println("Enter player Name");
                String player_name=br.readLine();

                System.out.println("Enter Player Age");
                int player_age=Integer.parseInt(br.readLine());

                System.out.println("Enter Player Batting Average");
                float Player_Average=Float.parseFloat(br.readLine());

                System.out.println("player Name "+ player_name);
                System.out.println("player_age "+ player_age);
                System.out.println("Player Batting Average "+ Player_Average);
        }
}
