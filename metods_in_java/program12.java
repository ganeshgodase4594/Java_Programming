class demo{


	void fun(int x){

		System.out.println("In fun");
		System.out.println(x);

	}

	public static void main(String[] args){

		demo obj=new demo();
		obj.fun(10);
		obj.fun(10.2f);
	}

}

//possible loosy conversion
