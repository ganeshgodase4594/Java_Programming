
import java.util.*;

class strongNo{

	public static void main(String[] args){

		Scanner obj=new Scanner(System.in);

		System.out.println("Enter The No");

		int num=obj.nextInt();

		int temp=num;
		int sum=0;
		int fact;


		while(num!=0){

			int rem=num%10;

			fact=1;

			for(int i=1;i<=rem;i++){

				fact=fact*i;
			}

			sum=sum+fact;

			num=num/10;
		}

		if(sum==temp){

			System.out.println(temp+" is a strong no");
		}else{

			System.out.println(temp+" is a not strong no");
			
		}	
	}
}

	

	
