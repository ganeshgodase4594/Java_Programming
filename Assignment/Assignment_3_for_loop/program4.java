class ganesh{

	public static void main(String[] args){

		int n=942111423;
		int count=0;

		for(int i=n;i!=0;i=i/10){

			int rem=i%10;

			if(rem%2!=0){

				count++;
			}
		}


                System.out.println(count);
	}
}
