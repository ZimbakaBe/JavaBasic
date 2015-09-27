package loopsMethodsClassesHomework;
import java.util.Scanner;

public class AngleConverter {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int numberOfQueries = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < numberOfQueries; i++) {
		
			String[] splitInput = in.nextLine().split(" ");
			
			double unitValue = Double.parseDouble(splitInput[0]);
			
			if(unitValue == 0) {
				System.out.printf("%.6f", unitValue);
				System.out.println();
				continue;
			}
			
			String unitType = splitInput[1];
			
			if(unitType.equals("deg")) {
				convertDegreesToRadians(unitValue);
			}
			else if(unitType.equals("rad")) {
				convertRadiansToDegrees(unitValue);
			}
			else {
				System.out.println("Wrong unit type.");
			}
		}
		
		in.close();
	}
	
	public static void convertDegreesToRadians(double value) {
//		double toRadians = Math.toRadians(value);
		double radians = (value / 180) * Math.PI;
		System.out.printf("%.6f rad", radians);
		System.out.println();
	}
	
	public static void convertRadiansToDegrees(double value) {
//		double toDegrees = Math.toDegrees(value);
		double degrees = (value * 180) / Math.PI;
		System.out.printf("%.6f deg", degrees);
		System.out.println();
	}

}
