interface Multiply{
	void multiply(int num1, int num2);
	//int multiply(int num1, int num2);
}

class Lambda{
	public static void main(String args[]){
		
		//1. Method
		Multiply multi = (num1, num2) -> {System.out.print("5 * 6 = " + num1 * num2);};
		multi.multiply(5, 6);
		
		//2. Method
		//Multiply multi = (num1, num2) -> (num1 * num2);
		//System.out.print("5 * 6 = " + multi.multiply(5, 6));
	}
}