//print the odd numbers addition and even numbers multiplication in array

class ArrayDemo{

        public static void main(String[] args){

                int arr[]=new int[5];

                arr[0]=1;
                arr[1]=2;
                arr[2]=3;
                arr[3]=4;
                arr[4]=5;

		int sum=0;
		int mult=1;



                for(int i=0;i<arr.length;i++){

                        if(arr[i]%2==1){

                            sum=sum+arr[i];
			}else{

				mult=mult*arr[i];
			
			
			
			}


                 }

		System.out.println(sum);
		System.out.println(mult);



        }


}

