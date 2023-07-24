import java.io.*;

class prime{

    boolean primeno(int no){

        int count=0;

        for(int i=1;i<=no;i++){
            
            if(no%i==0){

                count++;
            }
        }

        if(count==2){

            return true;
        }

        return false;

    }

    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("entre the number");

        int no=Integer.parseInt(br.readLine());

        prime obj=new prime();

        boolean ans=obj.primeno(no);

        if(ans==true){

            System.out.println(no + " is a prime number");
        }else{

            System.out.println(no + " is not a prime number");
        }

        
    }

}