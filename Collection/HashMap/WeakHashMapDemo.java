// WeakHashMap ...Used For Garbage Collector...
// Beacause HashMap Do Not Use Garbage Collector..

class dhiraj{

		String str=null;
		
		dhiraj(String str){
			
			this.str=str;
		}

		public String toString(){
		
			return str;
		}

		public void finalize(){
		
			System.out.println("notify!!!!");
		}
}

class client{
	
	public static void main(String[] args){
		
		dhiraj obj1=new dhiraj("core2web");
		dhiraj obj2=new dhiraj("biencaps");
		dhiraj obj3=new dhiraj("incubator");

		System.out.println(obj1); // obj1.toString();
		System.out.println(obj2);
		System.out.println(obj3);

		obj1=null;
		obj2=null;

		System.gc();

		System.out.println("in main");
	}
}
