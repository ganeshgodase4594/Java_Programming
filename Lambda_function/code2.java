
// lambda function with 1 parameter

interface core2web{

    String lang(int numcourse);
}

class year2023{

    public static void main(String[] args) {
        
        core2web c2w=(xyz) ->  "BootCamp/Java/Python/C "+" : " + xyz;

        System.out.println(c2w.lang(8));
    }
}