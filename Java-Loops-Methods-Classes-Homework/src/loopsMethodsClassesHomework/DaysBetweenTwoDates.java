package loopsMethodsClassesHomework;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenTwoDates {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String startingDateAsString = scanner.nextLine();
		if(startingDateAsString.length() == 9) {
			startingDateAsString = "0" + startingDateAsString;
		}
		
		String endingDateAsString = scanner.nextLine();
		if(endingDateAsString.length() == 9) {
			endingDateAsString = "0" + endingDateAsString;
		}
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate startingDate = LocalDate.parse(startingDateAsString,formatter);
		LocalDate endingDate = LocalDate.parse(endingDateAsString,formatter);
		
		long daysBetweenTwoDates = ChronoUnit.DAYS.between(startingDate, endingDate);
		
		System.out.println(daysBetweenTwoDates);
		
		scanner.close();
	}

}
