// compareto code without using built in function

package PractiseCodes;

public class program1 {

    static int compare(String str, String str1){

        char ch[] = str.toCharArray();
        char ch1[] = str1.toCharArray();

        int min = Math.min(ch.length,ch1.length);

        boolean flag = false;

        for(int i=0;i<min;i++){

            if(ch[i]!=ch1[i]){

                flag =true;
                return ch[i]-ch1[i];
            }

        }

        if(!flag){

            if(ch.length==ch1.length){
                return 0;
            }
            else{

                return ch.length-ch1.length;
            }

        }


        return 0;
    }
    public static void main(String[] args) {

        String str = "ganesh";
        String str1 = "gaMeshgodase";

        System.out.println(compare(str, str1));

    }
}

