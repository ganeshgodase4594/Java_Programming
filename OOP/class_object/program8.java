class project{
	
	String projectname="onlineedu";

	int noofemp=20;

	void clientinfo(){
		
		String clientname="core2web";

		System.out.println(clientname);
		System.out.println(projectname);

	}
}

class c2w{
	
	public static void main(String[] args){
		
		project obj=new project();

		obj.clientinfo();
	}
}
