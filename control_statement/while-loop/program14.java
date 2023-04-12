class Jay{

	public static void main(String[] args){

		int n1=0;
		int n2=1;

		int sum=0;

		int i=1;

		while(i<=30){

			sum=n1+n2;

			System.out.println(sum);

			n1=n2;
			n2=sum;

			i++;
		}
	}
}


