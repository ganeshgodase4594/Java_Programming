/*  
 find the target elememt in 2D array..
 */

import java.util.Scanner;

import javax.lang.model.SourceVersion;

class searching{

    static int linearsearch2D(int arr[][],int target){

        if(arr.length == 0) return -1;

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]==target){

                    String str=""+i+j;
                    // str+=i;
                    // str+=j;

                    int no=Integer.parseInt(str);

                    return no;

                }

            }
        }

        return -1;
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

        

        int ans=linearsearch2D(arr,target);

        if(ans==-1){

            System.out.println("element not found in array");
        }else{

            System.out.println("element found in array at index " + ans);
        }

    }

}