// Automorphic No

      class ganesh{

	      public static void main(String[] args){

		      int n=25;
		      int count=0;
		      int temp1=n;

		      

		      while(n!=0){

			      int c=n*n;

			      int rem1=n%10;
			      int rem2=c%10;

			      int sum1=(sum1*10)+rem1;
			      int sum2=(sum2*10)+rem2;

			      n=n/10;
			      c=c/10;
		      }

		      if(temp1==sum2){

			      System.out.println(n + "is automorphic");
		      }else{
			      System.out.println(n + "is not automorphic");
		      }
	      }
      }
			      
