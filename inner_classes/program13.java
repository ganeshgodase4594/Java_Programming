// normal inner class..

class Outer {
    int x = 10;
    static int y = 20;

    class Inner {
        void m1() {
            int a = 30;   
	    static int b=20;
        }
    }

    public static void main(String[] args) {
        int p = 50;
	static int q=40C;
        
        Inner obj = new Outer().new Inner();
        obj.m1();
    }
}

