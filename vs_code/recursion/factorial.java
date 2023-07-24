public class factorial{
    
    public static int factorial1(int n,int fact){

        if(n==1){

            fact=fact*n;

            return fact;

        }

        fact =fact*n;

       return factorial1(n-1,fact);

    }

    public static void main(String[] args){

        int n=5;

        int fact=1;

        int ans=factorial1(n,fact);

        System.out.println(ans);
    } 
}



