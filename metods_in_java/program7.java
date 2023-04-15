//perform all arithmetic operation using function

import java.util.*;
class Add{

        static void add(int a,int b){

                int ans=a+b;

                System.out.println(ans);

        }

         void sub(int a,int b){

                int ans=a-b;

                System.out.println(ans);
	}

        static void mult(int a,int b){

                int ans=a*b;

                System.out.println(ans);
	}

        void div(int a,int b){

                int ans=a/b;

                System.out.println(ans);
	}

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter The Value of a and b");

                int a=sc.nextInt();
                int b=sc.nextInt();

		Add obj=new Add();

                add(a,b);
		obj.sub(a,b);
		mult(a,b);
		obj.div(a,b);
        }
}
