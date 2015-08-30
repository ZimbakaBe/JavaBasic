package javaSyntaxHomework;
import java.util.Scanner;
import static java.lang.System.out;

public class PointsInsideAFigure {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double pointX = in.nextDouble();
		double pointY = in.nextDouble();
		
		checkPointPosition(pointX, pointY);
		
		in.close();
	}
	
	public static void checkPointPosition(double pointX, double pointY) {
		
		boolean isInside = false;
		
		if((pointX >= 12.5 & pointX <= 22.5) & (pointY >= 6 & pointY <= 8.5)) {
			isInside = true;
		}
		if((pointX >= 12.5 & pointX <= 17.5) & (pointY >= 8.5 & pointY <= 13.5)) {
			isInside = true;
		}
		if((pointX >= 20 & pointX <= 22.5) & (pointY >= 8.5 & pointY <= 13.5)) {
			isInside = true;
		}
		
		printPointPosition(isInside);
	}
	
	public static void printPointPosition(boolean isInside) {
		
		if(isInside == true) {
			out.println("Inside");
		}
		else {
			out.println("Outside");
		}
	}
}
