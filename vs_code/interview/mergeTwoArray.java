
import java.util.Scanner;

class twoArray{


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("enter the size of first array");

        int size1=sc.nextInt();

        int arr1[]=new int[size1];


        System.out.println("enter the size of second array");

        int size2=sc.nextInt();

        int arr2[]=new int[size2];

        int merge[]=new int[size1+size2];


        int num=0;

        System.out.println("take first array");

        for(int i=0;i<size1;i++){

            arr1[i]=sc.nextInt();
            merge[num]=arr1[i];

            num++;

        }

         System.out.println("take second array");


        for(int i=0;i<size2;i++){

            arr2[i]=sc.nextInt();
            merge[num]=arr2[i];
            num++;
        }

        System.out.println("end of merge array ");
        
        for(int i=0;i<merge.length;i++){

            System.out.println(merge[i]);
        }


    }
}