class ganesh{
	
	public static void main(String[] args){

		int n=7;

		if(n%2==0){

			for(int i=n;i>=1;i--){

				System.out.println(i);
			}
		}else{
			for(int i=n;i>=1;i=i-2){

				System.out.println(i);
			}
		}
	}
}



