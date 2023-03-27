
//armstrong no

class ganesh{

	public static void main(String[] args){

		int n=1634;
		int count=0;
		int temp1=n;
		
		int sum1=0;
		

		while(n!=0){

			count++;
			n=n/10;
		}
		for(int i=temp1;i!=0;i=i/10){

			int sum=1;

			int rem=i%10;
			
			for(int j=1;j<=count;j++)
			{
				sum=sum*rem;
			}


			sum1=sum+sum1;
			System.out.println(sum1);
		}

		System.out.println(sum1);
		System.out.println(temp1);

		if(sum1==temp1){

			System.out.println(temp1+"is armstrong");

		}else{
			System.out.println(temp1+"is not armstrong");
		}
	}
}
	
