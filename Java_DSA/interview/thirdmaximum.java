import java.util.Scanner;


public class thirdmaximum{

    public static int thirdmaxelement(int arr[]){

        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int thirdmax=Integer.MIN_VALUE;
        

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){

                max=arr[i];

            }


        }

       

        for(int i=0;i<arr.length;i++){

            if(arr[i]>secmax && arr[i]!=max){

                secmax=arr[i];
            }

        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]>thirdmax && arr[i]!=secmax && arr[i]!=max){

                thirdmax=arr[i];
            }

        }

        return thirdmax;


    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        

        System.out.println("Enter the size of the array");

        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the array");

        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        int ans=thirdmaxelement(arr);

        System.out.println("third maximum element in array is " + ans);
    }
}