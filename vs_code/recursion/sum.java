class sum{

    public static void firstnaturalnumbersum(int x,int sum,int n){

        if(x==n){

            sum=sum+x;
            System.out.println(sum);

            return;

        }

        sum=sum+x;

        firstnaturalnumbersum(x+1, sum, n);


    }

    public static void main(String[] args) {
        
        int x=1;
        int sum=0;

        int n=5;

        firstnaturalnumbersum(x,sum,n);


    }

}