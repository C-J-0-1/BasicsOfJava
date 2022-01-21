import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Time{
	public static void main(String args[]){
		long start = LocalTime.now().getNano();
		
		LocalDate date = LocalDate.now();
		System.out.println("\nToday's Date: " + date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Time: " + time);
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Today: " + today);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-LLL-yyyy HH:mm:ss.n a E");
		System.out.println("Today(Formated): " + today.format(formatter));
		
		long end = LocalTime.now().getNano();
		System.out.println("\nTime taken by this progam: " + (end-start)/1000000 + " milliseconds");
	}
}