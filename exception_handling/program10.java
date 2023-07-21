

import java.io.*;

class exceptiondemo{

        public static void main(String[] args){

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String str=null;
                try{

                         str=br.readLine();

                }catch(IOException ie){

                         System.out.println(str);
		}

		int data=0;

		try{
			
			data=Integer.parseInt(br.readLine());

		}catch(NumberFormatException ne){
			
			System.out.println("please ! Enter The Integer value");


		}
               
		catch(IllegalArgumentException obj){

                        System.out.println("please ! Enter The Intger Value");
		}
		catch(RuntimeException obj1){


                       System.out.println("please ! Enter The Intger Value");
		  }

                catch(Exception obj2){

                        System.out.println("please ! Enter The Intger Value");
		}

                catch(Throwable obj3){

                        System.out.println("please ! Enter The Intger Value");

                }/*catch(Object obj4){

                        System.out.println("please ! Enter The Intger Value");

                }*/

                System.out.println(data);
        }
}                                                                                      
