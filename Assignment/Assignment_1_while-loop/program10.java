class Ganesh{

        public static void main(String[] args){

                int n=8756;
                int sum=0;
		int temp=n;

                while(n!=0){

                        int rem=n%10;
                        sum=(sum*10)+rem;
                        n=n/10;

                }

                System.out.println(sum);

		if (sum==temp){

			System.out.println( temp+"is Palindrome no");

		}else{

				System.out.println(temp+"is not palindrome");
			}
		}
	}


        
