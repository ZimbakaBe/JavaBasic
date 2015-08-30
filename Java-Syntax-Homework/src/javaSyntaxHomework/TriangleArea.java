package javaSyntaxHomework;
import java.util.Scanner;
import static java.lang.System.out;

public class TriangleArea {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//first point
		double x1 = in.nextInt();
		double y1 = in.nextInt();
		
		//second point
		double x2 = in.nextInt();
		double y2 = in.nextInt();
		
		//third point
		double x3 = in.nextInt();
		double y3 = in.nextInt();
		
		out.println(CalculateTriangleAreaByGivenPoints(x1, x2, x3, y1, y2, y3));
		
		in.close();
	}
	
	public static double CalculateTriangleAreaByGivenPoints(double x1, double x2, double x3, double y1, double y2, double y3) {
		
		double triangleArea = Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2);
		
		return triangleArea;
	}
}
