class ganesh{

	public static void main(String[] args){

		int n=942111423;

		int rev=0;

		for(int i=n;i!=0;i=i/10){

			int rem=i%10;


			rev=(rev*10)+rem;

		}

		System.out.println(rev);
	}
}
		
