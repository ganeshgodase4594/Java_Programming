class switchDemo{

	public static void main(String[] args){

		int ch=65;

		switch(ch){

			case 'A':
				System.out.println("char_A");
				break;

			case 65:
				System.out.println("num-65");
				break;

			case 'B':
				System.out.println("char_B");
				break;
			case 66:
				System.out.println("num-66");
				
			default:
				System.out.println("no match");
				break;
		}

		System.out.println("after switch");
	}

}

//error :duplicate case

