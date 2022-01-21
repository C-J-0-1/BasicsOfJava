import java.util.ArrayList;

class Streams{
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1 ; i <= 100 ; i++){
			list.add(i);
		}
		
		int count = (int)list.stream()
			.filter(x -> x%3 ==0)
			.count();
		System.out.print("\nCount of numbers divided by 3(from 1 to 100): " + count);
		
		System.out.print("\n\nNumbers which are divided by 10(from 1 to 100):\n");
		list.stream()
			.filter(x -> x%10 == 0)
			.forEach(i -> System.out.print(i + ", "));
	}
}
