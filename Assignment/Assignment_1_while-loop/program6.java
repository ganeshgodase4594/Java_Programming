class Godase{

	public static void main(String[] args){

		int sum=0;
		int mul=1;
		int i=1;

		int N=10;

		while(i<=N){

			if(i%2==0){

				sum=sum+i;
			}else{
				mul=mul*i;
			}
			i++;
		}

		System.out.println(sum);
		System.out.println(mul);
	}
}

