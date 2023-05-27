// method 10: substring() ... imp

class substring{
	
	public static void main(String[] args){
		
		String str="core2web";


		System.out.println(str.substring(5));	//web
		System.out.println(str.substring(4,7)); //2we
		
		String str2="my name is gana bhai";

		System.out.println(str2.substring(5));  // me is gana bhai
		System.out.println(str2.substring(2,6));//  nam


	}	
}
// jevha aplyalay string madhum akhada part hava asel tar apan substring method use karto..
// jevha one parameter dila jato tithun pudhachi sagali string ghetali jate...5 dila asel tar correct 5 pasunch suru hote(index 0 pasun start hoto);
// jevha two parameter dile astil tevha first paramete string ghetali jate and second parameter chya one index agother stop keli jate...
