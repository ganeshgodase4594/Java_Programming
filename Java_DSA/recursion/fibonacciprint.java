
class fiboprint{

 static void printseries(int a,int b,int start,int count){

    if(start>count){

        return;
    }

    int c=a+b;

    System.out.println(a);
    
    printseries(b, c, start+1, count);


}

public static void main(String[] args) {
    
    int a=0;
    int b=1;
    int start=1;
    int end=5;

    printseries(a, b, start, end);

}


}