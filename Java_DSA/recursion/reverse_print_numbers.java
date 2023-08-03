class reverseprintNumber{

        public static void numbers(int num){

                if(num==0){

                    return;
                }

                System.out.println(num);

                numbers(num-1);

        }

        public static void main(String[] args) {
            
            int num=5;

            numbers(num);

        }

}