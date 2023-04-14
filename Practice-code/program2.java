
import java.util.*;

class strongNo{

        public static void main(String[] args){

                Scanner obj=new Scanner(System.in);

                System.out.println("Enter The No");

                int start=obj.nextInt();
                int end=obj.nextInt();

                

                for(int i=start;i<=end;i++){

	        int temp=i;
                int sum=0;
                int fact;



                while(temp!=0){

                        int rem=temp%10;

                        fact=1;

                        for(int j=1;j<=rem;j++){

                                fact=fact*j;
                        }

                        sum=sum+fact;

                        temp=temp/10;
                }

                if(sum==i){

                        System.out.println(i+" is a strong no");
                }else{

                        System.out.println(i+" is a not strong no");
		}
		
	    }
	}  
}
		



