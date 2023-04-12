class ganesh{

	public static void main(String[] args){


                int n=2332;
		int temp=n;

                int rev=0;

                for(int i=n;i!=0;i=i/10){

                        int rem=i%10;
			

			rev=(rev*10)+rem;

                }

                System.out.println(rev);

		if(temp==rev){

			System.out.println(temp + " is a palindrome");
		}else{
			System.out.println(temp + " is a not palindrome");
		}
        }
}

