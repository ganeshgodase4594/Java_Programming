/*  
 find the target elememt in 2D array..
 */

import java.util.Scanner;

import javax.lang.model.SourceVersion;

class searching{

    static int[] linearsearch2D(int arr[][],int target){

       // if(arr.length == 0) return -1;

        int arr1[]=new int[2];

        

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]==target){

                    arr1[0] =i;
                    arr1[1]  =j;
                    break;


                }

            }
        }

        return arr1;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("take the size of row in 2D array");
        int row=sc.nextInt();

         System.out.println("take the size of column in 2D array");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];


        System.out.println("enter 2D array");

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                arr[i][j]=sc.nextInt();

            }

        }

        System.out.println("enter the element do you want to search");
        int target=sc.nextInt();

        

        int[] ans=linearsearch2D(arr,target);

        System.out.println("index found at below");

        for(int i=0;i<ans.length;i++){

            System.out.println(ans[i]);
        }

        

    }

}