//print the addition of colun in array

import java.io.*;

class twodarray{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                int arr[][]=new int[3][3];

                for(int i=0;i<arr.length;i++){

                        for(int j=0;j<arr[i].length;j++){

                                arr[i][j]=Integer.parseInt(br.readLine());

                        }
                }


                System.out.println("Enter The 2D Array ");


                  for(int i=0;i<arr.length;i++){
				
				int sum=0;

                        for(int j=0;j<arr[i].length;j++){
                                          
                                System.out.print(arr[j][i]+" ");
    
                                sum=sum+arr[j][i];


                        }

                        System.out.println("Sum Of Array in Coloumn is " + sum );
                }



        }
}

/*
 
public class Main
{
    public static void main(String[] args){
        
	int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
	


	int num =0;
	while(num<=2){
	    
	int sum = 0;
	    
	    int x =0;
	    while(x<=2)
	    {
	        sum += a[x][num];
	        x++;
	        
	    }
	    System.out.print(sum+" ");
	    num++;
	    
	}
        
    }
	
}


 */
