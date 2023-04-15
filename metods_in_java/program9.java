

//check the given no is armstrong or not

import java.util.*;
class Armstrong{

	static void armstrong(int num){

		int count=0;
		int sum=0;
		int temp=num;

		while(num!=0){

			count++;
			num=num/10;
		}

		num = temp;
		while(num != 0){

			int mult = 1;
			int rem=num%10;

			for(int i = 1; i <= count; i++){

				 mult = rem * mult;
			}

			sum = sum + mult;

			num = num/10;

			System.out.println(sum);
		

                    }

		if(temp==sum){

			System.out.println(temp +" no is a armstrong");

		}else{
			System.out.println(temp +" no is a not armstrong");
		}
	}

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Armstrong No");

		int num=sc.nextInt();

		armstrong(num);

           }


}


