class Solapur{

        public static void main(String[] args){

                int n=6543;
                int reverse=0;
		int temp=6531;

                while(n!=0){

                        int rem=n%10;

                        reverse=(reverse*10)+rem;

                        n=n/10;
                }

                System.out.println(reverse);

		if(temp==reverse)

		{
			System.out.println("n is palindrome");
		}else{
			System.out.println("n is not palindrone");
		}
        }
}
