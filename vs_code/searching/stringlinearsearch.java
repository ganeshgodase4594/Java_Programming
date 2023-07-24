import java.util.Scanner;

import javax.lang.model.SourceVersion;

class searching{

    static boolean Stringlinearsearch(String str,int target){

        if(str.length() == 0) return false;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == target) return true;
        }

        return false;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

       System.out.println("enter the string");
       String str=sc.next();

       System.out.println("enter the character do you want to search in the string");

       char c=sc.next().charAt(0);

        boolean ans=Stringlinearsearch(str ,c);

        if(ans==true){

            System.out.println("character found in string");
        }else{

            System.out.println("character not found in element ");
        }

    }

}