// real time example of static,instance variable:

class sbibank{
	
	static String cashername="ganesh";

	int accountno=12345;

	String accountholdername="vikee";


	void accountholderinfo(){
		
		System.out.println("cashername = "+ cashername);

		System.out.println("accountno = " + accountno);

		System.out.println("accountholdername = " + accountholdername);
	}
}

class user{
	
	public static void main(String[] args){
		
		sbibank sbibank1=new sbibank();
		sbibank sbibank2=new sbibank();

		sbibank1.accountholderinfo();
		sbibank2.accountholderinfo();

		System.out.println("**********************************");

		sbibank2.cashername="dhiraj";
		sbibank2.accountno=45678;
		sbibank2.accountholdername="vishal";

		sbibank1.accountholderinfo();
		sbibank2.accountholderinfo();
	}

}
