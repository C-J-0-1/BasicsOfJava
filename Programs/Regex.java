import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Regex{
	public static void main(String args[]){
		String names[] = {"Anna", "Anthony", "Beck", "Cat", "Carl"};
		
		int count = 0;
		for(int i = 0 ; i < names.length ; i++){
			boolean match = Pattern.matches("Carl", names[i]);
			if(match)
			count++;
		}
		System.out.println("Count of name \"Carl\": " + count);
	}
}