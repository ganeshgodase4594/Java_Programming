/*
 
Q2.  Write a realtime example which include
1)static variable
2)non static variable
3) static method 
4) non static variable 
Access them by creating 2-3 object and draw a diagram of a code

 */
import java.io.*;

class maharashtra{
	
	static int population;

	String cityname;

	static int city(int population){

		return population;	

	}

	String cityname(String cityname){
		
		return cityname;
	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		maharashtra obj=new maharashtra();

		System.out.println("Enter City Name In Maharashtra");

		obj.cityname=br.readLine();

		System.out.println("Enter population in city");

		population=Integer.parseInt(br.readLine());

		System.out.println(city(population));

		System.out.println(obj.cityname(obj.cityname));



	}
}
