class ganesh{

	public static void main(String[] args){

		int n=56;
		int sum=0;
		int fact=1;

		for(int i=n;i!=0;i=i/10){

			int rem=i%10;

			for(int j=1;j<=rem;j++){


				fact=fact*i;
			}

			sum=sum+fact;
		}

		if(sum==n){

			System.out.println(n +" is a perfect no");
		}else{
			System.out.println(n +" is a not perfect no");
		}
	}
}






