import java.util.Scanner;


class maximum{

    public static int maximumelement(int arr[]){

        int max=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]>max){

                max=arr[i];

            }


        }

        return max;


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

        int ans=maximumelement(arr);

        System.out.println("maximum element in array is " + ans);
    }
}