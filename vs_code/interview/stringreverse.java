
import java.io.*;


class stringreverse{

    public static String reverse(String str){

        char arr[]=str.toCharArray();

        int start=0;
        int end=arr.length-1;

        while(start<end){

            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        String newreverseString = new String(arr);

       

        return newreverseString;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Take the User String you want to reverse: ");

        String str=br.readLine();

        System.out.println("After Reversed String");

        System.out.println(reverse(str));

    }

}

