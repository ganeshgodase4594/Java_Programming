class Core2Web {
	public static void main(String[] args) {
		StringBuffer var1 = new StringBuffer("Shashi");
		StringBuffer var2 = new StringBuffer("Shashi");
		System.out.println(var1.equals(var2));
		var1.setLength(3);
		System.out.println(var1);
	}
}

// false
// Sha 
