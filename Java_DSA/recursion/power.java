 class rasetopower {
    
    public static int calpower(int x,int n){

        if(x==0){

            return 0;
        }

        if(n==0){

            return 1;
        }

        int ans=calpower( x, n-1);
        System.out.println(ans);

        int xpown=x*ans;

        return xpown;


    }

    public static void main(String[] args) {
        int x=5;
        int n=5;

        int finalans=calpower(x, n);

        System.out.println(finalans);
    }
}
