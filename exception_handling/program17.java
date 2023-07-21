// real time example of exception handling...

import java.util.*;

class BalancewithdrawalException extends RuntimeException{
	
	BalancewithdrawalException(String msg){
		
		super(msg);
	}
}

class withdrawal{
	
	public static void main(String[] args){
	
		System.out.println("***************__SBI ATM __***********");

		System.out.println();

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your Current Account Balance!!");

		int Acc_current_balance=sc.nextInt();

		System.out.println("Enter your withdrawal amount");

		int withdrawal_amount=sc.nextInt();

		if(Acc_current_balance >= withdrawal_amount){
			
			System.out.println("congratulations !!! Your Money withdrawal Successfully....!!!");
		}else{
			
			throw new BalancewithdrawalException("Insufficient balance ! your Current balance is " +Acc_current_balance);
		}
	}
}
