class Switchdemo{

	public static void main(String[] args){

		int x=3;
		int a=1;
		int b=2;

		switch(x){

			case a:
				System.out.println("1");
				break;

			case b:
				System.out.println("2");
				break;

			case a+b:
				System.out.println("3");
				break;

			case a+a+b:
				System.out.println("4");
				break;

			case a+b+b:
			        System.out.println("5");
				break;

			default:
				System.out.println("no match");
				break;

		}
		System.out.println("After Switch");
	}
}

// constant expression required

			


