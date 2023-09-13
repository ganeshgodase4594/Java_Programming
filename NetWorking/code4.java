import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

class URLConnectionDemo{

    public static void main(String[] args) {
        
        try {
            URL obj = new URL("https://www.youtube.com");

            URLConnection conn = obj.openConnection();

            System.out.println("Last Modified : " + new Date(conn.getLastModified()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
