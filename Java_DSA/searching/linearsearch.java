import java.util.Scanner;

import javax.lang.model.SourceVersion;

class searching{

    static int linearsearch(int arr[],int target){

        if(arr.length == 0) return -1;

        for(int i=0;i<arr.length;i++){

            if(arr[i] == target) return i;
        }

        return -1;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("take the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("enter array");

        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("enter the element do you want to search");
        int target=sc.nextInt();

        int ans=linearsearch(arr,target );

        if(ans==-1){

            System.out.println("element not found in array");
        }else{

            System.out.println("element found in array at index " + ans);
        }

    }

}