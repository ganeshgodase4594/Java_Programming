// 

class stringbufferdemo{

        public static void main(String[] args){

                String str1="shashi";
		
		System.out.println(System.identityHashCode(str1));
                
		str1=str1.concat("bagal");

                System.out.println(System.identityHashCode(str1)); 
                


        }
}
