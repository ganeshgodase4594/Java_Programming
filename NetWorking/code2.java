
// get the all info of site..

import java.io.IOException;
import java.net.*;
class URLDemo{

    public static void main(String[] args)throws IOException {
        
        URL obj=new URL("https://www.youtube.com");

        System.out.println(obj.getProtocol());
        System.out.println(obj.getPort());
        System.out.println(obj.getFile());
    }
}