import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

// class OpenWebsite {
//     public static void main(String[] args) {
//         String url = "https://www.youtube.com";

//         try {
//             Desktop.getDesktop().browse(new URI(url));
//         } catch (IOException | URISyntaxException e) {
//             e.printStackTrace();
//         }
//     }
// }

import java.io.IOException;
import java.net.URISyntaxException;
import java.awt.*;
import java.net.URI;


class OpenWebSite{

    public static void main(String[] args)throws URISyntaxException,IOException {
        
         String url = "https://www.youtube.com";

         URI obj=new URI(url);

         Desktop desk=Desktop.getDesktop();

         desk.browse(obj);
    }
}