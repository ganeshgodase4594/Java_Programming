// indexof() method

class indexofdemo{
	
	public static void main(String[] args){
		
		String str1="Shashi";

		System.out.println(str1.indexOf('h',0)); // 1
		System.out.println(str1.indexOf('h',1)); // 1
		System.out.println(str1.indexOf('h',2)); // 4
		System.out.println(str1.indexOf('S',0)); // 0
		System.out.println(str1.indexOf('h',3)); // 4
		System.out.println(str1.indexOf('i',7)); //-1
		System.out.println(str1.indexOf('S',7)); //-1
	}
}

// ya method madhye element jya index la ahe tyacha index print kela jato..
// ani jar te chararcter sapdale nahi tar -1 return kele jate..
