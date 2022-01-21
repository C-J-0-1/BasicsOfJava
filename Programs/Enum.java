enum Rainbow{
	RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;
}

class Enum{
	public static void main(String args[]){
		Rainbow rainbow[] = Rainbow.values();
		
		System.out.print("\nColors of Rainbow: \n");
		for( Rainbow r: rainbow){
			System.out.print(r.ordinal()+1 + "  " + r + "\n");
		}
	}
}