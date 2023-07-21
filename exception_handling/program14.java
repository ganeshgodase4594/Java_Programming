// stackoverflow Exception..

class stackdemo{
	
	public static void fun(int x){
		
		System.out.println(x);
		fun(++x);
	}

	public static void main(String[] args){
		
		int num=1;
		fun(num);
	}
}
