import java.io.*;

class anagram{

    public static boolean isAnagram(String str1,String str2){

        if(str1.length()!=str2.length()){

            return false;
        }

        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        for(int i=0;i<arr1.length-1;i++){
  
            for(int j=0;j<arr1.length-i-1;j++){

                if(arr1[j]>arr1[j+1]){

                    char temp=arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1]=temp;

                }

                if(arr2[j]>arr2[j+1]){

                    char temp=arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1]=temp;

                }
        }

    }

    for(int i=0; i<arr1.length; i++){

        if(arr1[i]!=arr2[i]){

            return false;
        }
    }

    return true;
}

    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter string one");

        String str1=br.readLine();

        System.out.println("enter String two");

        String str2=br.readLine();

       boolean ans= isAnagram(str1, str2);

       if(ans==true){

         System.out.println("given string is anagram");

       }else{

        System.out.println("given string is not anagram");
       }

      



    }

}