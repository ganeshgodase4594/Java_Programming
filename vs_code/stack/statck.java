
/*
 push();
 pop();
 peek();
 */

import java.util.Scanner;

class stackopearation{

    int n=10;

    int a[]=new int[n];

    int top=-1;

 void push(Scanner sc){

    if(top==(n-1)){

        System.out.println("stack overflow");

    }else{

        int data=sc.nextInt();
        
        top++;

        a[top]=data;

        System.out.println("element inserted");

    }


 }

 void pop(){

    if(top==-1){

        System.out.println("stack underflow");
    }else{

        top--;

    }

 }

 void peek(){

    if(top==-1){

        System.out.println("stack underflow");
    }else{

       System.out.println("peek element is " + a[top]);
    }

 }

 void display(){

    

    for(int i=0;i<a.length;i++){

        System.out.println(a[i]);
    }

 }
}

class client{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        stackopearation obj=new stackopearation();

        System.out.println("******************************* Stack operation ********************************");

        System.out.println();

        int choice=0;

        while(choice!=4){

            System.out.println("\n1.push\n2.pop\n3.peek\n4.display");

            System.out.println("enter the choice");
             choice=sc.nextInt();

            switch(choice){

                case 1:

                obj.push(sc);
                break;

                case 2:

                obj.pop();
                break;

                case 3:

                obj.peek();
                break;

                case 4:

                obj.display();
                break;

                default:

                System.out.println("Enter a valid choice");

            }

        }



    }

}