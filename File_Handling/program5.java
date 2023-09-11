// create one folder and create one file in that folder...

import java.io.*;

class demo2{

public static void main(String[] args)throws IOException{

        File pobj=new File("FileHij","aniket");

        pobj.createNewFile();

        }
}

// if folder does not exist then it give error;
// compulsory first parameter folder is required...
