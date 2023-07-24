class printNumber{

        public static void numbers(int num){

                if(num==6){

                    return;
                }

                System.out.println(num);

                numbers(num+1);

        }

        public static void main(String[] args) {
            
            int num=1;

            numbers(num);

        }

}