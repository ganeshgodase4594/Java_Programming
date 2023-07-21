// arithmetic exception using try and catch..

class demo{

        public static void main(String[] args){

                System.out.println("start main");

                try{

                        System.out.println(10/0);       // risky code...


                }catch(RuntimeException obj){
	
                        System.out.println("please do not divide by 0");
                }

                System.out.println("End Main");

        }
}

// output:
// start main
// please do not divide by 0
// end main
