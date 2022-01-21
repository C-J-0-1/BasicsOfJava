class Test{
	final int var = 1;
	
	final void show(){
		System.out.print("This is a final method");
	}
}

class Final extends Test{
	void show(){
		System.out.print("This is a inherited method");
	}
	public static void main(String args[]){
		Test test = new Test();
		test.var = 2; // It will show an error.
		
		Final f = new Final();
		f.show(); // It will show an error.
	}
}