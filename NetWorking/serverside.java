
import java.io.*;
import java.net.*;

class server{

    public static void main(String[] args)throws IOException {
        
        ServerSocket ss=new ServerSocket(1487);

        Socket s=ss.accept();

        System.out.println("Connection Established...!!!!");

        OutputStream os=s.getOutputStream();

        PrintStream ps=new PrintStream(os);

        ps.println("Hello ....");
        ps.println("jevlis ka");

        ps.close();
        s.close();
        ss.close();
    }
}