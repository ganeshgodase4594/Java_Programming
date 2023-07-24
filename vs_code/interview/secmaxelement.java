import java.util.Scanner;


class secmaximum{

    public static int secmaxelement(int arr[]){

        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){

                max=arr[i];

            }


        }

        System.out.println(max);

        for(int i=0;i<arr.length;i++){

            if(arr[i]>secmax && arr[i]!=max){

                secmax=arr[i];
            }

        }

        return secmax;


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

        int ans=secmaxelement(arr);

        System.out.println("second maximum element in array is " + ans);
    }
}