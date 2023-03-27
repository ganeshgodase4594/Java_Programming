// composite no
    class ganesh{

	    public static void main(String[] args){

		    int n=2;
		     int count=0;

		     for(int i=1;i<=n;i++){

			     if(n%i==0){

				     count++;
			     }
		     }
		     if(count==1){

			     System.out.println(n+"is a composite no");

		     }else if(count>2){

			     System.out.println(n+"is a composite no");
		     }else{
			     System.out.println(n+"is not composite");
		     }
	    }
    }
