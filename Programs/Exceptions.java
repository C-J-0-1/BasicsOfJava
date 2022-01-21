class Exceptions{
	public static void main(String args[]){
		System.out.println("\nThis is Exception handling");
		
		int a = 10;
		int b = 0;
		try{
			System.out.println("try block started.");
			int c = a/b;
			System.out.println("Will not print beacuse an exception is occured.");
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Divided by Zero.");
		}
		catch(Exception e){
			System.out.println("This is generic exception.");
		}
		finally{
			System.out.println("This is finally block. It alwsys gets executed.");
		}
	}
}