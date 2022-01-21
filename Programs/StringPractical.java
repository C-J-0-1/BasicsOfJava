class StringPractical{
	public static void main(String args[]){
		String string = "     This is String.      ";
		StringBuilder stringBuilder = new StringBuilder("This is String Builder.");
		StringBuffer stringBuffer = new StringBuffer("This is String Buffer.");
		
		for(int i = 0 ; i < 5 ; i++){
			stringBuilder.append("\nThis is String Builder.");
			stringBuffer.append("\nThis is String Buffer.");
		}
		
		System.out.println("\nOld String: " + string + "\nUpper Case String: " + string.trim().toUpperCase());
		System.out.println("\nStringBuilder: \n" + stringBuilder.toString().trim().toUpperCase());
		System.out.println("\nStringBuffer: \n" + stringBuffer.toString().trim().toUpperCase());
	}
}