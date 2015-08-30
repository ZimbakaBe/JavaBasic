package javaSyntaxHomework;
import java.util.Scanner;
import static java.lang.System.out;

public class RectangleArea {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double sideALength = in.nextDouble();
		double sideBLength = in.nextDouble();
		
		out.print(calculateRectangleArea(sideALength, sideBLength));
		
		in.close();
	}
	
	public static double calculateRectangleArea(double sideALength, double sideBLength) {
		
		double result = sideALength * sideBLength;
		
		return result;
	}
}

