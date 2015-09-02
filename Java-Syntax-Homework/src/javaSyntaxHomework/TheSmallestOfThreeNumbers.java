package javaSyntaxHomework;
import static java.lang.System.out;
import java.util.Scanner;

public class TheSmallestOfThreeNumbers {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double firstNumber = in.nextDouble();
		double secondNumber = in.nextDouble();
		double thirdNumber = in.nextDouble();
		
		out.println(getSmallestNumber(firstNumber,secondNumber,thirdNumber));
		
		in.close();
	}
	
	public static double getSmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {
		
		double smallestNumber = firstNumber;
		double[] allNumbers = new double[] {secondNumber, thirdNumber};
		
		for(int i = 0; i < 2; i++) {
			
			if(allNumbers[i] < smallestNumber) {
				smallestNumber = allNumbers[i];
			}
		}
		
		return smallestNumber;
	}
}
