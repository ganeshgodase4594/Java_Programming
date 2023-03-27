class ganesh{

	public static void main(String[] args){

		int N=12;
		int count=0;

		for(int i=1;i<=N;i++){

			if(N%i==0){

				count++;
			}

			if(count>2){



                                System.out.println(i);

				break;

				
			}

			if(count==2){

				System.out.println(N+" is a prime no");

			}else{
					System.out.println(N+"is a not prime");
				}
			}
	}
}
