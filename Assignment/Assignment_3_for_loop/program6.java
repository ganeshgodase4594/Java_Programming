class ganesh{

	public static void main(String[] args){

		int n=10;
		int sum=0;
		int mul=1;

		for(int i=1;i<=n;i++){

			

			if(i%2==0){

				sum=sum+i;
			}else{
			

				if(i%2!=0){

					mul=mul*i;

					
				}
			}
		}



                System.out.println(sum);


                System.out.println(mul);
	}
}

