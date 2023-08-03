
import java.util.Scanner;

class searching{

    public static int order_agnostic_binarysearch(int[] arr,int target){

        // binary search

        int start=0;
        int end=arr.length-1;

        boolean isAscending;

            if(arr[start]<=arr[end]){

                isAscending = true;
            }else{
                isAscending = false;
            }

        while(start<=end){

            
     int mid=start+(end-start)/2;

            if(arr[mid]==target){

                return mid;
            }

            if(isAscending){

                if(arr[mid]>target){
                
                end=mid-1;

            }else{

                start=mid+1;

            }

        }else{

             if(arr[mid]<target){
                
                end=mid-1;

            }else{

                start=mid+1;

            }


        }


            
    }

        return -1;

}

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);

       System.out.println("enter the size of array");
        
       int n=sc.nextInt();
       
        System.out.println("enter the sorted array");

        int arr[]=new int[n];

        for(int i=0; i<arr.length; i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("enter the target element");
        int target=sc.nextInt();

        int ans=order_agnostic_binarysearch(arr, target);

        System.out.println("target element fount at index " + ans);

    }


}