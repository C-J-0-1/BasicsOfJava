class Test{
	static int var = 1;
	
	static{
		System.out.print("\nThis is a static block.\n");
	}
	
	static void show(){
		System.out.print("\nThis is a static method. It has been called without an Object.");
	}
}

class Static{
	public static void main(String args[]){
		System.out.print("Static variable: " + Test.var);
		Test.show();
	}
}