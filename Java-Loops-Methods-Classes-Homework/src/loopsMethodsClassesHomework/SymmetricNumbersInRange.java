package loopsMethodsClassesHomework;
import java.util.ArrayList;
import java.util.Scanner;

public class SymmetricNumbersInRange {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int startRange = in.nextInt();
		int endRange = in.nextInt();
		
		System.out.println(getSymmetricNumbersInRange(startRange, endRange));
		
		in.close();
	}
	
	public static String getSymmetricNumbersInRange(int startRange, int endRange) {
		
		ArrayList<String> symmetricNumbers = new ArrayList<String>();
		String currentNumber;
		
		for(int i = startRange; i <= endRange; i++) {
			currentNumber = Integer.toString(i);
			
			if(currentNumber.length() < 2) {
				symmetricNumbers.add(currentNumber);
			}
			
			if(currentNumber.length() > 1 & (currentNumber.charAt(0) == currentNumber.charAt(currentNumber.length()-1))) {
				symmetricNumbers.add(currentNumber);
			}
		}
		
		String joinSymmetricNumbers = String.join(" ", symmetricNumbers);
		
		return joinSymmetricNumbers.toString();
	}
}
