class vishal{

	public static void main(String[] args){

		int n=153;
		int sum=0;
		int temp=153;

		while(n!=0){

			int rem=n%10;

			sum=sum+(rem*rem*rem);

			n=n/10;
		}

		System.out.println(sum);

		if(sum==temp){

			System.out.println("this is armstrong no");

		}else{
			System.out.println("this is not armstring no");
		}
	}
}

