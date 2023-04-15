import java.util.*; 

class Main{

    

    public static void main(String[] args){
        
    Scanner sc=new Scanner(System.in);

    int n1=sc.nextInt();
    int n2=sc.nextInt();
        
        

        for(int i=n1; i<=n2; i++){
            
            int count=0;
            
            for(int j=1; j<=i ; j++){

                if(i % j==0){

                    count++;
                }
            }
            if(count==2){

                System.out.println(i);
            }

        }
    }
}

