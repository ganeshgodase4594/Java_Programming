class SwitchDemo{

	public static void main(String[] args){

		int x=5;

		switch(x){

			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 5:
				System.out.println("5");
				break;
			case 5:
				System.out.println("second 5");
				break;
			case 2:
				System.out.println("second 2");
				break;
			default:
				System.out.println("no match");
				break;
		}
		System.out.println("After Switch");

	}
}

// output: error 2 duplicate case
