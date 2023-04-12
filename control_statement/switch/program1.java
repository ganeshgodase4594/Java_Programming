
//switch statement

class switchDemo{

	public static void main(String[] args){

		int x=3;

		switch(x){

			case 1:
				System.out.println("one");
			case 2:
				System.out.println("two");
			case 3:
				System.out.println("three");
			case 4:
				System.out.println("four");
			case 5:
				System.out.println("five");
			default:
				System.out.println("no match");
		}

		System.out.println("After Switch");
	}
}

//Required break Statement otherwisw it will print all starement
